import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		int fact = 1;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any num:");
		int n = obj.nextInt();
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}System.out.println("Factorial value of your num is:"+fact);
	} 
}

