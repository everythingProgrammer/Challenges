package fundamentalChallenges;
import java.util.*;
public class PrintReverse {
	
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		
		String str = sr.nextLine();
		
		for(int i = str.length()-1 ; i>=0; i--)
			System.out.print(str.charAt(i));
		
		
		
	}
	
	
}
