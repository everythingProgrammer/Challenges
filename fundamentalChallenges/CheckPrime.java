package fundamentalChallenges;
import java.util.*;
public class CheckPrime {
	
	public static void main(String args[]) {
		
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		 int i,m=0,flag=0;      
		  
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println("Prime");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println("Not Prime");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println("Prime"); }  
		  }//end of else  
		
		
	}
	
	
}
