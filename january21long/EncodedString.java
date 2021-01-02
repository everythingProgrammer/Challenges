package january21long;
import java.util.*;
public class EncodedString {
	
	public static String decode(String binary) {
		
		String ans = "";
		for(int i = 0 ; i<binary.length() ; i+=4)
		{
//			ans += (char) (97+ (8*Integer.parseInt(binary.charAt(i)+"")) + (4*Integer.parseInt(binary.charAt(i+1)+"")) + (2*Integer.parseInt(binary.charAt(i+2)+"") ) + (1*Integer.parseInt(binary.charAt(i+3)+"")) );
			
			ans += (char) (97+Integer.parseInt( binary.substring(i,i+4) ,2));
//			System.out.println(  (97+(8*Integer.parseInt(binary.charAt(i)+"")) + (4*Integer.parseInt(binary.charAt(i+1)+"")) + (2*Integer.parseInt(binary.charAt(i+2)+"") ) + (1*Integer.parseInt(binary.charAt(i+3)+"")) ));
		}
		
		return ans;
	}
	
	
	public static void main(String args[]) throws Exception {
		
		try {
			ArrayList<String> str = new ArrayList<>();
			Scanner sr = new Scanner(System.in);
			int T = sr.nextInt();
			while(T> 0) {
				int N = sr.nextInt();
				sr.nextLine();
				str.add( sr.nextLine());
				T--;
			}
			for(String st: str)
				System.out.println(decode(st));
		}
		catch(Exception e) {
			
		}
		
	}
}
