package DecemberCookOff2020;
import java.util.*;
public class ATTENDU {
	public static void main(String args) {
		
		Scanner sr = new Scanner(System.in);
		int T = 0;
		ArrayList<String> output = new ArrayList<>();
		T = sr.nextInt();
		while(T>0) {
			T--;
			int N = sr.nextInt();
			int remainingDays = 120-N;
			int count = 0;
			String attendanceBits = "";
			attendanceBits= sr.nextLine();
			
			for(int i = 0 ; i<attendanceBits.length() ; i++) {
				
				if(attendanceBits.charAt(i) == '1') {
					count++;
				}
				
				
			}
			if(((remainingDays+count)/120 )*100 >=75.00 ) {
				output.add("YES");
				
			}else {
				output.add("NO");
			}
		}
		for(String print: output) {
			System.out.println(print);
		}
		
	}
	
	
}
