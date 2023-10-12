import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
    	int choice=1;
        Scanner scanner = new Scanner(System.in);
        while(choice==1) {
            System.out.print("Enter a string: ");
            String input = scanner.next();
            
            if (isPalindrome(input)) {
                System.out.println("Palindrome!");
            } else {
                System.out.println("Not a palindrome.");
            }
            System.out.println("enter the choice :: ");
            choice=scanner.nextInt();
            }
            System.out.println("Exit the program :: ");
        }
        
       
    
    
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        } else if
        (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
         return isPalindrome(str.substring(1, str.length() - 1));
    }
}