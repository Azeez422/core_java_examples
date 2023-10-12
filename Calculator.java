import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		int Choice;
		Scanner obj = new Scanner(System.in);
		while(true){
			System.out.print("Enter a Num:");
			int n = obj.nextInt();
			System.out.println("Enter your operator: + - * / %");
			String opp = obj.next();
			System.out.println("Enter Another Num:");
			int m = obj.nextInt();
			switch(opp) {
			case "+" :System.out.println(n+m);
			break;
			case "-" :System.out.println(n-m);
			break;
			case "*" :System.out.println(n*m);
			break;
			case "/" :System.out.println(n/m);
			break;
			case "%" :System.out.println(n%m);
			break;
			}
			System.out.println("Enter choice:1-continue,2-exit:");
			Choice = obj.nextInt();
		}
		 
		

}
}