package codeChefMarchLunchTime;
import java.util.*;
public class Motivation {
	
	public static int maxRating(int space , int s[] , int r[]) {
		int max_rating = 0;
		for(int i = 0 ; i<s.length; i++) {
			if(s[i] <= space && r[i]>max_rating) {
				max_rating = r[i];
			}
		}
		return max_rating;
	}
	
	
	
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		// X GB space remaining... 
		// N movies represented by (Si, Ri)  ... // space, rating
		// single best movie
		// T
		// N , X 
		// N lines follows Si and Ri 
		int T = sr.nextInt();
		ArrayList<Integer> ans = new ArrayList<>();
//		ArrayList<Integer, Integer> N  = new ArrayList<>();
		while(T>0) {
			T--;
			int n = sr.nextInt();
			int x = sr.nextInt(); // space
			int s[] = new int[n];
			int r[] = new int[n];
			for(int i = 0 ; i<n; i++) {
				s[i]= sr.nextInt();
				r[i] = sr.nextInt();	
			}
			
			ans.add( maxRating(x, s, r));
			
		}
		for(int a: ans) {
			System.out.println(a);
		}
	}
}
