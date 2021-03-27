package codeChefMarchLunchTime;

import java.util.ArrayList;
import java.util.*;
public class MakeSumEven {
	
	public static int sumeven(int nums[]) {
		int count = -1;
		int sum =0;
		for(int i = 0 ; i< nums.length; i++) {
			sum = sum+nums[i];
		}
		if(sum%2 == 0) {
			return 0;
		}else {
			for(int i = 0 ; i< nums.length; i++) {
				if(nums[i]%2 != 0   &&  ((nums[i]/2)-1)%2 == 0 ) {
					return 1;
				}
			}
		}
		return -1;
	}
	
	
	
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		int T = sr.nextInt();
		ArrayList<Integer> ans = new ArrayList<>();
		while(T>0) {
			T--;
			int n  = sr.nextInt();
			int arr[] = new int[n];
			for(int i = 0 ; i<n; i++) {
				arr[i] = sr.nextInt();
			}
			ans.add(sumeven(arr));
		}
		for(int a: ans) {
			System.out.println(a);
		}
	}
	
}
