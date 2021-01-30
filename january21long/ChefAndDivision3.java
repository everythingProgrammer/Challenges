package january21long;
import java.util.*;

public class ChefAndDivision3 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int t = s.nextInt();
	while(t-- !=0) {
		int n = s.nextInt();
		long k = s.nextLong();
		long d = s.nextLong();
		int a[] = new int[n];
		long sum = 0;
		for(int i=0; i<n; i++){
		          a[i] = s.nextInt();
		          sum+=a[i];
		 }
	     long MaxDays=Math.floorDiv(sum,k);
		 if(MaxDays>d){
		          System.out.println(d);
		  }
		  else{
		      System.out.println(MaxDays);
		  }
	}
	s.close();
	}

}