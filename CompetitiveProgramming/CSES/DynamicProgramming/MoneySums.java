package CompetitiveProgramming.CSES.DynamicProgramming;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MoneySums {

	static class FastReader {
		private static final int BUFFER_SIZE = 1 << 16;
		private final DataInputStream din;
		private final byte[] buffer;
		private int bufferPointer, bytesRead;
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		FastReader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		FastReader(String file_name) throws IOException {
			din = new DataInputStream(new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ') {
				c = read();
			}
			final boolean neg = c == '-';
			if (neg) {
				c = read();
			}
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (neg) {
				return -ret;
			}
			return ret;
		}

		public long nextLong() throws IOException {
			long ret = 0;
			byte c = read();
			while (c <= ' ') {
				c = read();
			}
			final boolean neg = c == '-';
			if (neg) {
				c = read();
			}
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg) {
				return -ret;
			}
			return ret;
		}

		public double nextDouble() throws IOException {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ') {
				c = read();
			}
			final boolean neg = c == '-';
			if (neg) {
				c = read();
			}

			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (c == '.') {
				while ((c = read()) >= '0' && c <= '9') {
					ret += (c - '0') / (div *= 10);
				}
			}

			if (neg) {
				return -ret;
			}
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1) {
				buffer[0] = -1;
			}
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

		private byte read() throws IOException {
			if (bufferPointer == bytesRead) {
				fillBuffer();
			}
			return buffer[bufferPointer++];
		}

		public void close() throws IOException {
			din.close();
		}
	}

	static int MOD = (int) 1e9 + 7;

	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		PrintWriter output = new PrintWriter(System.out);
		int n = sc.nextInt() + 1;
		int max = (int) 1e5 + 1;
		int[] nums = new int[n];
		for (int i = 1; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		boolean[][] dp = new boolean[n][max];
		dp[0][0] = true;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < max; j++) {
				dp[i][j] = dp[i - 1][j];
				if (j - nums[i] >= 0 && dp[i - 1][j - nums[i]]) {
					dp[i][j] = true;
				}
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 1; i < max; i++) {
			if (dp[n - 1][i])
				ans.add(i);
		}
		output.write(ans.size() + "\n");
		for (int i : ans)
			output.write(i + " ");
		output.flush();
	}
}