package fundamentalChallenges;
import java.util.*;
public class Chewbecca 
{

	
	static void findMin(long a)
	{
		long d; 
		long count =0;
		StringBuffer str = new StringBuffer(""+a);
		StringBuffer st = new StringBuffer("");
		for(int i = 0 ; i< str.length(); i++)
		{
			d = (long) str.charAt(i);
			if(d>=53 && d<=57)
			{	
				if(i==0 && d == 57 && count==0)
				{
					st = st.append(str.charAt(i));
				}
				else
					{
						d= 57-d;
						st = st.append(""+d);
					}
			}
			else {
					st = st.append(str.charAt(i));
					count++;
			}
		}
		System.out.println(st);
		
	}
	public static void main(String args[])
	{
		
		Scanner sr = new Scanner(System.in);
		long a =0;
		a = sr.nextInt();
		findMin(a);
	}
}