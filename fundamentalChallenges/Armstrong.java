package fundamentalChallenges;
import java.util.*;
public class Armstrong {
	
	
	public static void main(String args[]) {
			Scanner sr = new Scanner(System.in);
			 int number = sr.nextInt(), originalNumber, remainder, result = 0;
			 	
			 if(number < 0 )
				 System.out.println("false");
			 
		        originalNumber = number;

		        while (originalNumber != 0)
		        {
		            remainder = originalNumber % 10;
		            result += Math.pow(remainder, 3);
		            originalNumber /= 10;
		        }

		        if(result == number)
		            System.out.println("true");
		        else
		            System.out.println("false");   
		   
		
		
	}
	
	
}
