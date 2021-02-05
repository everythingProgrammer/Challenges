package feb_long;
import java.util.*;
public class FrogSort {
	
	
	
	public static int countMoves(int w[] , int right[]) {
		
		int count = 0 ; // to Count the number of shifts...
		int arr[] = new int[w.length+1]; // to store initial position of frogs
		
		/* lets initialize the initial places of frogs*/
		for(int i = 0 ; i< w.length; i++) {
			arr[w[i]] = i+1;	
		}
		/* positions start form 1 remember this*/

		
		/*Now we have to perform a linear scan at every position of i
		 * in arr */
		int balanced = 0 ;
		for(int i = 0 ; balanced< w.length; i++) {
			
			/*iterate over position array and then check weights*/
			if(arr[i])
			
			
		}
		
		
//		for(int a: arr)
//			System.out.print(a+" ");
		
		return 0;
	}
	
	
	
	
	public static void main(String args[]) {
		
		int arr[] = {3,1,2};
		int right[] = {1,4,5};
		countMoves(arr, right);
		
		
	}
	
}
