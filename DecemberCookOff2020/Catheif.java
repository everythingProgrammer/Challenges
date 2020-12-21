package DecemberCookOff2020;
import java.util.*;
public class Catheif {
	
	public static void main(String args[]) {
		try {
		Scanner sr = new Scanner(System.in);
		int T = 0;
		T = sr.nextInt();
		ArrayList<String> ans = new ArrayList<>();
		while(T> 0) {
			T--;
			int x = sr.nextInt();
			int y = sr.nextInt();
			int k = sr.nextInt();
			int n = sr.nextInt();
			
			if(((Math.abs(x-y)+(x-0))/k)%2 == 0) {
				ans.add("YES");
			}else {
				ans.add("NO");
			}
			
			
			
		}
		for(String a: ans)
			System.out.println(a);
		
		}
		
	catch(Exception e) {
		
	}
	
	}
	
	
}
