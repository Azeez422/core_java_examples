package Arrays;
public class Swap {
	public static void main(String[] args) {
		int arr[] = {4,3,2,1};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) { 
	                if (arr[j] < arr[i]) {
	                	 int temp = 0;
	                     if (arr[j] < arr[i]) {
	      
	                         // Swapping
	                         temp = arr[i];
	                         arr[i] = arr[j];
	                         arr[j] = temp;
	                }
	 
	                     
			}
		}
 	}
}
