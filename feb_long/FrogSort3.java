package feb_long;
import java.util.*;

/*make individual cases for n = 2 , 3, 4*/
public class FrogSort3 {
	
	public static int countMoves(int w[] ,int l[]) {
		int count = 0 ; 
		
		if(w.length == 2) {
			if(w[0] < w[1] ) {
				return 0;
			}
			else {
				return 1;
			}
		}
		else if(w.length == 3) {
			int a = 0, aind = 0 ;
			int b = 0, bind = 0 ;
			int c = 0, cind = 0 ;
			for(int i = 0 ; i< 3; i++) {
				if(w[i] == 1) {
					a = i;
					aind = i; // ap will be used to get jumps of 1.
				}else if(w[i] == 2) {
					b = i;
					bind = i;
				}else if(w[i] ==3 ) {
					c = i ; 
					cind = i ; // cind will be used to get jumps of 3 form array l[]
				}
			}
			/*Once this is done  now we just have to balance everything out
			 * 
			 * a is for 1 , b is for 2 , c is for 3 
			 * and a b c are containing indexes of these 
			 * so accordingly  a<b<c for 1,2,3 to be in sorted order , right?
			 * 
			 * */
			count = 0;
			while( a>c || b>c || a>b) {
				/*if a > b then b has to move forward ( because a cannot go right so b goes left )
				 * so move b to left unless it is strictly greater than a */
				while(b<=a) {
					b+=l[bind];
					count++;
				}
				/*While c becomes strictly greater than b and a move it left*/
				while(c<= b || c<= a) {
					c+=l[cind];
					count++;
				}
				/*while will make sure that all the conditions are met
				 * then only we'll be able to say that conditions are good! */
			}
		}
		else if(w.length == 4) {
			int a = 0, aind = 0 ;
			int b = 0, bind = 0 ;
			int c = 0, cind = 0 ;
			int d = 0, dind = 0 ; 
			for(int i = 0 ; i< 4; i++) {
				if(w[i] == 1) {
					a = i;
					aind = i; // ap will be used to get jumps of 1.
				}else if(w[i] == 2) {
					b = i;
					bind = i;
				}else if(w[i] ==3 ) {
					c = i ; 
					cind = i ; // cind will be used to get jumps of 3 form array l[]
				}
				else if(w[i] == 4) {
					d = i; 
					dind = i;
				}
			}
			count = 0;
			while( c>d|| b>c || a>b || a>d || b>d) {
				/*if a > b then b has to move forward ( because a cannot go right so b goes left )
				 * so move b to left unless it is strictly greater than a */
				while(b<=a) {
					b+=l[bind];
					count++;
				}
				/*While c becomes strictly greater than b and a move it left*/
				while(c<= b || c<= a) {
					c+=l[cind];
					count++;
				}
				while(d<=c || d<=a || d<= b) {
					d+=l[dind];
					count ++;
				}
				/*while will make sure that all the conditions are met
				 * then only we'll be able to say that conditions are good! */
			}
		}
		return count;
	}
	
	
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		int t = sr.nextInt();
		ArrayList<Integer> ans = new ArrayList<>();
		
		while(t>0) {
			t--;
			int n = sr.nextInt();
			int w[] = new int[n];
			int l[] = new int[n];
			
			for(int i = 0 ; i<n; i++)
				w[i] = sr.nextInt();
			for(int i = 0 ; i<n ; i++)
				l[i] = sr.nextInt();
			ans.add(countMoves(w,l));
			
		}
		for(int a:ans) {
			System.out.println(a);
		}
		
		
	}
	
	
}
