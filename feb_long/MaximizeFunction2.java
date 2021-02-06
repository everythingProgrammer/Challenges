package feb_long;
import java.util.*;

public class MaximizeFunction2 {

	public static int maxDiff(int nums[]) {
		String str = "";
		int maxDiff = 0; 	
//		ArrayList<Integer> num = new ArrayList<>();
		for(int k =0; k<=nums.length -2; k++) {
			
			for(int l = k+1; l<nums.length -1; l++) {
			
				for(int i = l+1; i<nums.length  ; i++) {
						int diff = Math.abs(nums[k]-nums[l])+Math.abs(nums[l]-nums[i] )+ Math.abs(nums[i]- nums[k] );
//						System.out.print(diff+"  ");
//						num.add(diff);
						if(diff>=172) {
							maxDiff = diff;
							str+= nums[k]+" "+nums[l]+" "+nums[i]+"||||| ";
						}
					}
				
			}
		}
		System.out.println(str);
//		Collections.sort(num);
//		System.out.println(num);
		return maxDiff;
		
	}
	
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		int t = sr.nextInt();
		ArrayList<Integer> ans = new ArrayList<>();
		
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
	
	
	
}
