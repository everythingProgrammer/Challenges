package feb_long;
import java.util.*;
public class HighestDivisor {
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		
		try {
			
			int N = sr.nextInt();
			for(int i = 10; i>=1; i--) {
				if(N%i == 0){
					System.out.println(i);
					System.exit(0);
				}
			}
			
			
			
		}
		catch(Exception e){
			
		}
		
	}
	
	
}
