package january21long;

import java.util.*;

class ChefandDivison4 {
	public static void main(String args[]) throws java.lang.Exception {

		Scanner sr = new Scanner(System.in);
		try {
			int T = sr.nextInt();
			while (T > 0) {
				T--;
				int n = sr.nextInt();
				int k = sr.nextInt();
				int d = sr.nextInt();
				int tq = 0;
				while (n > 0) {
					n--;
					tq += sr.nextInt();
				}
				if (tq < k) {
					System.out.println("0");
				} else {
					int count = tq / k;
					if (count > d) {
						System.out.println("" + d);
					} else
						System.out.println("" + count);
				}
			}
		} catch (Exception e) {
			return;
		}
	}
}
