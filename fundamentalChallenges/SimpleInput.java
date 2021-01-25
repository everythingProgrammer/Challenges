package fundamentalChallenges;
import java.util.*;

public class SimpleInput {
	
	public static void main(String args[]) {
		int sum = 0;
		Scanner sr = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		int a = sr.nextInt();
		sum+=a;
		
		while(sum>=0) {
			arr.add(a);
			a = sr.nextInt();
			sum+=a;
		}
		
		for(int b:arr ) {
			System.out.println(b);
		}
		
		
	}
	
	
}
