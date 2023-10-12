package BiggestNum;
public class BiggestNum {
	public static void main(String[] args){
		int n,a[] = {10,70,60,90,40,80};
		int Max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>Max) {
				Max=a[i];

			} 
		}System.out.println("Biggest num in array is:"+Max);

 
	}

}
