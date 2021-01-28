package fundamentalChallenges;
import java.util.*;
public class MaxinArray {
	
	
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		int n  = 0; 
		n  = sr.nextInt();
		long arr[] = new long[n];
		for(int i = 0 ; i< arr.length; i++) {
			arr[i] = sr.nextLong();
		}
		long max = 0 ; 
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
	
}
