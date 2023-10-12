package Integer;
import java.util.Scanner;
public class Integer {
	public static void main(String[] args) {
		int i,n;
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter a num:");
		n = myobj.nextInt();
		for(i=-32468; i<=+32467; i++) {
			if(n == i) {
				System.out.println("Integer num:");
			}
			else {
				System.out.println("Not an integer num");
			}
		}
	}

}
  