package feb_long;
import java.util.*;
public class MaximizeFun3 {
	
	
	public static int maxDiff(int nums[]) {
		Arrays.sort(nums);
		int diff = Math.abs(nums[0]-nums[1])+Math.abs(nums[1]-nums[nums.length-1])+Math.abs(nums[nums.length-1]-nums[0]);
		return diff ;
	}
	
	
	
	public static void main(String args[])throws java.lang.Exception {
		Scanner sr = new Scanner(System.in);
		ArrayList<Integer> ans = new ArrayList<>();
		try{
				int t = sr.nextInt();
			
			while(t>0) {
				t--;
				int n = sr.nextInt();
				int nums [] = new int [n];
				for(int i = 0 ; i<nums.length; i++) {
					nums[i] = sr.nextInt();
				}
				
				ans.add(maxDiff(nums));
			}	
			
			for(int a : ans) {
				System.out.println(a);
			}
		}
		catch(Exception e) {
			
		}
	}
	

}
