import java.util.Scanner;
public class Task1 {
	public static void main(int range) {
        int a = 1; 
        double b = 1.0; 
        System.out.print(" 1 ");
        for (int i = 0; i <= range; i++) {
        	
            int denominator = 2 * i + 1;
            
            if (denominator <= range) {
                System.out.print((a == 1 ? " + " : " - ") + "1/" + denominator);
                b += a * 1.0 / denominator; 
                a *= -1; 
            } else {
                break;
            }
        }
        
        System.out.println();
        System.out.println("Value of the series: " + b); 
    }

    public static void main(String[] args) {
    	main(10); 
    }
}