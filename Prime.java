import java.util.Scanner;
public class Prime{    
 public static void main(String args[]){    
  int i,k=0,l=0;      
  Scanner obj = new Scanner(System.in);
  System.out.println("Enter any num:");
  int n = obj.nextInt();
  k=n/2;      
  if(n==0||n==1){  
   System.out.println(n+" is not prime number");      
  }else{  
   for(i=2;i<=k;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");      
     l=1;      
     break;      
    }      
   }      
   if(l==0)  { System.out.println(n+" is prime number"); }  
  } 
}    
}   