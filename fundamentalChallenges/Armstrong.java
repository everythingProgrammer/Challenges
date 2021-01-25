package fundamentalChallenges;
import java.util.*;
public class Armstrong {
	
	
	public static void main(String args[]) {
			Scanner sr = new Scanner(System.in);
			int c=0,a,temp;  
		    int n=sr.nextInt();//It is the number to check armstrong  
		    temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("true");   
		    else  
		        System.out.println("false");   
		   }  
		
		
	}
	
	
}
