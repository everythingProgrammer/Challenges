package january21long;

import java.util.*;
import java.util.Collections;

public class FairElections {

	public static int countChanges(int joj[], int jojsum, int jaj[], int jajsum) {
		int count = 0;
		if (jojsum > jajsum) {
			return 0;
		}
		Arrays.sort(joj);
		Arrays.sort(jaj);

		for (int i = 0; i < joj.length && i < jaj.length && joj[i] < jaj[jaj.length - 1 - i] && jojsum < jajsum; i++) {
			count++;
			int temp = joj[i];
			joj[i] = jaj[jaj.length - 1 - i];
			jojsum += joj[i] - temp;
			jaj[jaj.length - 1 - i] = temp;
			jajsum -= joj[i] - temp;

		}

		if (jojsum < jajsum)
			return -1;

		return count;
	}

	public static void main(String args[]) throws java.lang.Exception {

		Scanner sr = new Scanner(System.in);
		ArrayList<Integer> ans = new ArrayList<>();
		int T = sr.nextInt();

		while (T > 0) {
			T -= 1;
			int N = sr.nextInt();
			int M = sr.nextInt();
			int joj[] = new int[N];
			int jaj[] = new int[M];
			int jojsum = 0;
			int jajsum = 0;
			for (int i = 0; i < N; i++) {
				joj[i] = sr.nextInt();
				jojsum += joj[i];
			}
			for (int i = 0; i < M; i++) {
				jaj[i] = sr.nextInt();
				jajsum += jaj[i];
			}
			ans.add(countChanges(joj, jojsum, jaj, jajsum));
		}

		for (int a : ans)
			System.out.println(a);

	}

}
