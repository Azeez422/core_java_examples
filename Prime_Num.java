public class Prime_Num{    
public static void main(int n){  
  int i,m=0,num=0;      
  m=n/2;      
  if(n==0||n==1){  
   System.out.println(n+" is not prime number");      
  }else{   
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");      
     num=1;      
     break;      
    }      
   }      
   if(num==0)  { System.out.println(n+" is prime number"); }  
  }//end of else  
}  
 public static void main(String args[]){    
  main(1);  
  main(3);  
  main(17);  
  main(20);  
}    
}   