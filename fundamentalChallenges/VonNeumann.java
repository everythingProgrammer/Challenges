package fundamentalChallenges;
import java.util.*;
public class VonNeumann {
	
	public static void main(String args[]) {
		int t; 
		Scanner sr = new Scanner(System.in);
		t = sr.nextInt();
		
		String arr[] = new String[t];
		
		for(int i = 0 ; i< t; i++) {
			arr[i] = sr.next();
		}
		
//		System.out.println();
		for(String st : arr)
//			System.out.println(st);
			System.out.println(Integer.parseInt(st,2));
			
		}
		
		
	}
	

