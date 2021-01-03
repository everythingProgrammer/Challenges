package january21long;
import java.util.*;
 
public class EncodedString2 {
	
	static HashMap<String, String> codes = new HashMap<>();

	
	public static String decode(String code) {
		
		String ans = "";
		for(int i = 0;i<code.length(); i+=4) {
			
			String bin = code.substring(i, i+4);
			if(codes.containsKey(bin)) {
				ans += codes.get(bin);
			}
			else {
				char ch = (char) (97+Integer.parseInt( bin ,2));
				codes.put(bin,  ch+"");
				ans += ch;
			}
			
		}
		
		return ans;
		
	}
	
	public static void main(String args[])throws java.lang.Exception {
		
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
