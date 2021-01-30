package january21long;

import java.util.ArrayList;
import java.util.Scanner;

public class ChefDivision2 {
public static void main(String args[]) throws java.lang.Exception {
		
		try {
		Scanner sr = new Scanner (System.in);
		
		int T = sr.nextInt();
		if(T < 1 || T>1000) {
			throw new Exception();
		}
		ArrayList<Integer> ans = new ArrayList<>();
		while(T > 0) {
			T--;
			int N = sr.nextInt();
			int K = sr.nextInt();
			int D = sr.nextInt();
			
			if(N < 1 || N > 100 || K <1 || K> Math.pow(10, 9) || D <1 || D> Math.pow(10, 9))
			{
				throw new Exception();
			}
			
			
			int sum = 0;
			for(int i = 0 ; i< N ; i++) {
				int A = sr.nextInt();
				if(N==1 && i == 1) {
					if(A<1 || A> Math.pow(10, 5));
				}
				sum+= A;
			}
			int days = (int) Math.floor(sum/K);
			
			if(days<= 0) {
				ans.add(0);
			}
			else if(days< D) {
				ans.add(days);
			}
			else if(days> D) {
				ans.add(D);
			}
			
		}
		for(int a:ans) {
			System.out.println(a);
		}
		sr.close();
		}
		catch(Exception e) {
			
		}
		
	}
}
