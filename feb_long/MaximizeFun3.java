package feb_long;
import java.util.*;

/*1
30
1 30 3 4 5 6 7 28 9 20 11 22 13 14 15 26 17 18 19 10 21 12 23 24 25 16 27 8 29 2


1
30
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30





1
25
1 2 3 4 5 6 7 8 9 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30



1
5
10 25 32 34 2




1
12
-6 -5 9 4 -62 8 -7 10 13 24 -9 12*/


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
