package CompetitiveProgramming.CSES.DynamicProgramming;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class GridPaths {
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
		int[][] dp = new int[n][n];
		char[][] mat = new char[n][n];
		for (int i = 0; i < n; i++)
			mat[i] = sc.next().toCharArray();
		for (int i = 0; i < n; i++) {
			if (mat[i][0] != '*')
				dp[i][0] = 1;
			else
				break;
		}
		for (int i = 0; i < n; i++) {
			if (mat[0][i] != '*')
				dp[0][i] = 1;
			else
				break;
		}
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (mat[i][j] != '*') {
					dp[i][j] += dp[i - 1][j] + dp[i][j - 1];
					dp[i][j] %= (int) 1e9 + 7;
				}
			}
		}
		out.print(dp[n - 1][n - 1]);
		out.flush();
	}
}
