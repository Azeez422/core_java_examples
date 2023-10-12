package jdbc1;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class Jdbc1 {
		public static void main(String[] args) throws SQLException {
			Connection connection = null;
			Statement statement = null;
			ResultSet resultSet = null;
			String dbURL = "jdbc:mysql://192.168.0.150:3306/codebegun";
			String userName = "root";
			String password = "root";
			String query = "select * from userinfo_table";
			
			try {
				//Class.forName ("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(dbURL, userName, password );
				statement = connection.createStatement();
				resultSet = statement.executeQuery(query);
				
				while(resultSet.next()) {
					Exc1 info = new Exc1();
					info.setUserinfo_id(resultSet.getInt("userinfo_id"));
					info.setUserid(resultSet.getString("userid"));
					info.setUser_password(resultSet.getString("user_password"));
					info.setActivestatus(resultSet.getBoolean("activestatus"));
					//System.out.println(resultSet.getInt("userinfo_id"));
					//System.out.println(resultSet.getString("userid"));
					//System.out.println(resultSet.getString("user_password"));
					//System.out.println(resultSet.getBoolean("activestatus"));
					//System.out.println("-------------------------");
					List<Exc1> li=new ArrayList<Exc1>();
					li.add(info);
					for(Exc1 a:li) {
						System.out.println(a.userinfo_id);
						System.out.println(a.userid);
						System.out.println(a.user_password);
						System.out.println(a.activestatus);
						System.out.println("------------------");
					}
					
				}
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					resultSet.close();
					connection.close();
					statement.close();
				}
		}

	}

