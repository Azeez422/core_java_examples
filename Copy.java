package jdbc1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Copy {
	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		Statement statement=null;
//		PreparedStatement statement=null;
		ResultSet resultset=null;
		String dburl="jdbc:mysql://192.168.0.150:3306/codebegun";
		String username="root";
		String password="root";
		String query="select*from userinfo_table";
//		String insertquery="select*from student(StudentID,FirstName,Email) values (?,?)";
		try {
			connection=DriverManager.getConnection(dburl,username,password);
			statement=connection.createStatement();
//			statement=connection.prepareStatement(insertquery);
			resultset=statement.executeQuery(query);
			
			
			Copy JDBCinput=new Copy();
			
			while(resultset.next()) {
				List<Copy> list=new ArrayList<>();
				
				Copy.setuserinfo_id(resultset.getInt("userinfo_id"));
				Copy.setuserid(resultset.getString("userid"));
				Copy.setuser_password(resultset.getString("user_password"));
				Copy.setMobile(resultset.getLong("Mobile"));
				
				list.add(JDBCinput);
				
				for(Copy element: list) {
					System.out.println("student Id: "+element.getStudentID());
					System.out.println("First name: "+element.getFirstName());
					System.out.println("Email: "+element.getEmail());
					System.out.println("Mobile: "+element.getMobile());
					System.out.println("----------------------");

					
				}
				
//				statement.setInt(0, 30);
//				statement.setString(1, "Azzez");
//				statement.setString(2, "azzez@gmail.com");
//				
//				int result=statement.executeUpdate();
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
			statement.close();
			resultset.close();
			
			
		}
	}

}