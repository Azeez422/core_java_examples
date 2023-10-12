package array;
import java.util.Scanner;
public class array {  
    public static void main(String[] args) {  
        int [] arr = new int [] {1, 2, 3, 4, 5, 5};  
        int sum = 0;  
        for (int i = 0; i < arr.length; i++) {  
           if(arr[i]%2==0) {
        	   sum = sum+1;
           }else if(arr[i]==5) {
        	   sum = sum+5;
           }else if(arr[i]%2==1){
        	   sum = sum+3;
           }
        }  
        System.out.println("answer is:" + sum);  
    }  
}  
