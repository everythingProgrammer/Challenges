package codechefMarchlong;
import java.util.*;
public class ChefandGroups {
	
	
	public static int countGroups(String str) {
		
		int i = 0 ;
		int len = str.length();
		int count = 0;
		while(i<len) {
			
			if(str.charAt(i)== '0') {
				i=i+1;
			}
			else {
				count++;
				while(i<len && str.charAt(i) =='1') {
					i=i+1;
				}
			}
		}
		return count;
	}
	
	
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		int T = sr.nextInt();
		sr.next();
		String seatings[] = new String[T];
		for(int i = 0 ;i<T; i++) {
			seatings[i] = sr.nextLine();
		}
		
		for(int i  = 0 ; i<T; i++) {
			System.out.println(countGroups(seatings[i]));
		}
	}	
}
