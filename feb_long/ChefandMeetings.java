package feb_long;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class ChefandMeetings{
	
	
	public static void main(String args[]) throws ParseException {
		Scanner sr = new Scanner(System.in);
		
		int t = sr.nextInt(); // number of testcases
		sr.next();
		
		String ftime = sr.nextLine(); // Input time 
		DateFormat df = new SimpleDateFormat("hh:mm aa");
		DateFormat outputformat = new SimpleDateFormat("HH:mm");
		Date date = null;
		String fixedTime  ;
		date = df.parse(ftime);
		fixedTime = outputformat.format(date ); 
		//fixedTime has our initial time honestly 
		
		
		
		 
		
		
	}
	
	
}
