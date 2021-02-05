package fundamentalChallenges;
import java.util.*;
public class ReplaceBy5 {
	
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		String num = sr.nextLine();
		String num2 = "";
		for(int i = 0  ; i<num.length(); i++) {
			if(num.charAt(i)=='0') {
				num2+="5";
			}
			else {
				num2+=num.charAt(i);
			}
		}
		System.out.println(num2);
		
	}
	
	
}
