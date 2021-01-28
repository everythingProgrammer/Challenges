package fundamentalChallenges;
import java.util.*;
public class FibonacciPattern {
	
	
	public static void main(String args[]) {
		
		
		/*for given input you have to print n(n+1)/2 fibonacci numbers*/
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		int n1 =0; 
		int n2 =1; 
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		for(int i = 1; i< (n*(n+1))/2 ; i++)
		{
			list.add(n1+n2);
			n1 = n2;
			n2 = list.get(i+1);
		}
		
//		System.out.println(list);
		int k = 0;
		for(int i = 0  ; i < n; i++) {
			for(int j = 0 ; j<=i; j++) {
				System.out.print(list.get(k)+" ");
				k++;
			}
			System.out.println();
		}
		
		
	}
	
	
}
