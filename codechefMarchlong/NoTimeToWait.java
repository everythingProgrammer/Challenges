package codechefMarchlong;
import java.util.*;
public class NoTimeToWait {
	
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		int n =  sr.nextInt();
		int h = sr.nextInt();
		int x = sr.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i< n ; i++) {
			arr[i] = sr.nextInt();
		}
		int diff  = h-x;
		for(int i = 0 ; i<n ; i++) {
			if(arr[i]>= diff) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
	
}
