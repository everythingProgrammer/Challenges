package january21long;
import java.util.*;
 
public class EncodedString2 {
	
	static HashMap<String, Character> codes = new HashMap<>();

	
	public static String decode(String code) {
		
		String ans = "";
		for(int i = 0;i<code.length(); i+=4) {
			
			String bin = code.substring(i, i+4);
			if(codes.containsKey(bin)) {
				System.out.println(".");
				ans += codes.get(bin);
			}
			else {
				char ch = (char) (97+Integer.parseInt( bin ,2));
				codes.put(bin,  ch);
				ans += ch;
			}
			
		}
		
		return ans;
		
	}
	
	public static void main(String args[])throws java.lang.Exception {
		codes.put("0000", 'a');
		codes.put("0001", 'b');
		codes.put("0010", 'c');
		codes.put("0011", 'd');
		codes.put("0100", 'e');
		codes.put("0101", 'f');
		codes.put("0110", 'g');
		codes.put("0111", 'h');
		codes.put("1000", 'i');
		codes.put("1001", 'j');
		codes.put("1010", 'k');
		codes.put("1011", 'l');
		codes.put("1100", 'm');
		codes.put("1101", 'n');
		codes.put("1110", 'o');
		codes.put("1111", 'p');

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
