package fundamentalChallenges;
import java.util.*;
public class DigitOccurences {
	
	public static void main(String args[]) {
		
		Scanner sr = new Scanner(System.in);
		
		String number = sr.next();
		String digit = sr.next();
		int count = 0;
		for(int i = 0; i< number.length(); i++) {
			if(number.charAt(i) == digit.charAt(0)) {
				count ++; 
			}
			
		}
		
		System.out.println(count);
		
	}
	
	
}
