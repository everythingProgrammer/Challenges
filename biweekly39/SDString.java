package biweekly39;
import java.util.*;
public class SDString {
	
	public static void main(String args[]) {
		
		Scanner sr = new Scanner(System.in);
		
		int ones  = 0;
		int zeroes = 0;
		int changeable = 0;
		String binary = sr.nextLine();
		for(int i = 0  ; i<binary.length()-1; i++ ) {
			
			if(binary.charAt(i) == '1') {
				ones++;
			}
			else {
				zeroes++;
			}
			if(binary.charAt(i) != binary.charAt(i+1)) {
				changeable++;
			}
			
		}
		if(binary.charAt(binary.length() -1) == '1') {
			ones++;
		}else {
			zeroes++;
		}
		if(ones-zeroes > 0) {
			zeroes+=changeable;
			if(ones-zeroes <= 0) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		else if(zeroes - ones > 0) {
			ones+=changeable;
			if(zeroes - ones <= 0) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		else 
			System.out.println("YES");
		
		
		
	}
	
	
}
