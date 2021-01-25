package fundamentalChallenges;
import java.util.*;
public class CelciusToFarenheight {
	
	
	public static void main(String args[]) {
		
		Scanner sr = new Scanner(System.in);
		float t0 = sr.nextFloat();
		float t1  = sr.nextFloat();
		float gap = sr.nextFloat();
		
		float current = t0;
		
		while(current <= t1) {
			System.out.println( (int)current +" "+ (int)(( 5 *(current - 32.0)) / 9.0) );
			current+=gap;
		}
		
		
		
		
		
	}
	
	
}
