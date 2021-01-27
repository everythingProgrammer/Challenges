package gfg30DaysofCode;
import java.util.*;
public class GeekandClassmates {
	
	
	void prank(long a[] , int n) {
		
		for(int i = 0 ; i< a.length; i++) {
			long temp = a[i]; //This is the index as well as the number
			a[i]  = a[(int) temp];
			a[(int) temp] = temp; 
			
			
		}
		
		
	}
	
	public static void main() {
		
	}
	
	
}
