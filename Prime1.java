import java.util.Scanner;
public class Prime1 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any num:");
		int n = obj.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			} 
		}
		if(count==2) {
			System.out.println("Prime number:");
		}else {
			System.out.println("Not a Prime number:");
		}
	}
}
