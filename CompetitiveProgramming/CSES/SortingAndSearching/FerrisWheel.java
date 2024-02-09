package CompetitiveProgramming.CSES.SortingAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class FerrisWheel {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int x = sc.nextInt();
		Integer[] people = new Integer[n];
		for (int i = 0; i < n; i++) {
			people[i] = sc.nextInt();
		}
		Arrays.sort(people);
		int i = 0;
		int j = n - 1;
		int c = 0;
		while (i <= j) {
			if (people[i] + people[j] <= x) {
				c++;
				i++;
				j--;
			} else {
				c++;
				j--;
			}
		}
		System.out.println(c);
	}
}
