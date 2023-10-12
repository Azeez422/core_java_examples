import java.util.Scanner;
public class Big_Num {
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter value of A:");
		int a = obj.nextInt();
		System.out.println("Enter value of B:");
		int b = obj.nextInt();
		if(a>b) {
			System.out.println("A is biggest");
		}else if(b>a) {
			System.out.println("B is biggest");
		}else {
			System.out.println("Small num");
		}
	}

}
