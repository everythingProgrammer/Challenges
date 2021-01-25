package fundamentalChallenges;
import java.util.*;
public class PrintSeries {
	
	
	
	
	public static void main(String args[]) {
		
		Scanner sr = new Scanner(System.in);
		
		int N1 = sr.nextInt();
		int N2 = sr.nextInt();
		
		// N1 terms  3n+2 % N2 != 0
		int n = 1;
		
		int count = 0;
		while(count< N1) {
			int sum = 3*n+2;
			if(sum%N2 != 0) {
				System.out.println(sum);
				count++;
			}
			n++;
		}
		
		
		
	}
}
