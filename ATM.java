import java.util.Scanner;
public class ATM {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter User_Id:");
		String n = obj.next();
		System.out.println("Enter Password:");
		String m = obj.next();
		if(n.equals(m)) {
			System.out.println("Enter Amount");
			int amount = obj.nextInt();
			logic();
			
		}else {
		}	System.out.println("Enter valid user_id/password");
		}
	
	public static void logic() {
	;
		// Scanner obj = new Scanner(System.in);
		//int amount = obj .nextInt(); 
		int a = (amount /2000);
		int b = amount - (a*2000);
		int c = (b/500);
		int d = b - (c*500);
		System.out.println("No of 2000 notes are:"+a);
		System.out.println("Balance amount:"+b);
		System.out.println("No of 500 notes are:"+c);
		System.out.println("Balance amount:"+d);
	}
	 
}
 