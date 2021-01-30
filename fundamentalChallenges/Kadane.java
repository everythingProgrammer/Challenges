package fundamentalChallenges;
import java.util.*;
public class Kadane {
	static int maxSubArraySum(int a[]) 
    { 
        int size = a.length; 
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0; 
        for (int i = 0; i < size; i++) 
        { 
            max_ending_here = max_ending_here + a[i]; 
            if (max_so_far < max_ending_here) 
                max_so_far = max_ending_here; 
            if (max_ending_here < 0) 
                max_ending_here = 0; 
        } 
        return max_so_far; 
    } 
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		int m = 0;
		ArrayList<Integer> ans = new ArrayList<>();
		while(n> 0) {
			m = sr.nextInt();
			int arr[] = new int[m];
			
			for(int i = 0  ; i< m ; i++) {
				
				arr[i] = sr.nextInt();	
			}
			ans.add(maxSubArraySum(arr));
			n--;
		}
		for(int i : ans) {
			System.out.println(i);
		}
	}	
}
