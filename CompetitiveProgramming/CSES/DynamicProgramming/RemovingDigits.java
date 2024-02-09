package CompetitiveProgramming.CSES.DynamicProgramming;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RemovingDigits {
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
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int[] dp = new int[n + 1];
		Arrays.fill(dp, (int) 1e9);
		dp[0] = 0;
		for (int i = 0; i <= n; i++) {
			for (char c : Integer.toString(i).toCharArray()) {
				dp[i] = Math.min(dp[i], dp[i - (c - '0')] + 1);
			}
		}
		out.println(dp[n]);
		out.flush();
	}
}
