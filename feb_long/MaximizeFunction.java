package feb_long;
import java.util.*;
public class MaximizeFunction {
	
	public static void main(String args[]) {
		
		Scanner sr = new Scanner(System.in);
		int t = sr.nextInt();
		ArrayList<Long> var = new ArrayList<>();
//		ArrayList<String> ans = new ArrayList<>();
		while(t>0) {
			t--;
			long max = Integer.MIN_VALUE;
			int n = sr.nextInt();
			long nums[] = new long[n] ;
			for(int i = 0;i<n; i++) {
				nums[i] = sr.nextLong();
			}
			
			for(int i = 1 ; i<nums.length -1; i++) {
				Long diff = Math.abs( nums[i-1] - nums[i])+ Math.abs(nums[i ]- nums[i+1])+ Math.abs(nums[i+1]-nums[i-1]) ;
				if(diff>max ) {
					max = diff;
//					System.out.println(nums[i-1]+" "+nums[i]+" "+nums[i+1]);
				}
				
			}
			var.add(max);
		}
		
		for(Long values: var) {
			System.out.println(values);
		}
		
	}
	
	
}
