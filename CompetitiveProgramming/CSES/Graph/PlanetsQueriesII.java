package CompetitiveProgramming.CSES.Graph;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class PlanetsQueriesII {
	static class FastReader {
		private static final int BUFFER_SIZE = 1 << 16;
		private final DataInputStream din;
		private final byte[] buffer;
		private int bufferPointer, bytesRead;

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

		public String readLine() throws IOException {
			final byte[] buf = new byte[1024]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n') {
					break;
				}
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
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

	static int lift(int x, int d) {
		if (d <= 0)
			return x;
		int j = 0;
		while (d > 0) {
			if ((d & 1) == 1)
				x = dp[j][x];
			d >>= 1;
			j++;
		}
		return x;
	}

	static void dfs(int u) {
		int v = dp[0][u];
		vis[u] = true;
		if (!vis[v])
			dfs(v);
		dist[u] = dist[v] + 1;
	}

	static int logn = 32;
	static int[][] dp;
	static int[] dist;
	static boolean[] vis;

	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		PrintWriter output = new PrintWriter(System.out);
		int n = sc.nextInt();
		int m = sc.nextInt();
		dp = new int[logn][n];
		dist = new int[n];
		vis = new boolean[n];
		Arrays.fill(vis, false);
		for (int i = 0; i < n; i++) {
			dp[0][i] = sc.nextInt() - 1;
		}
		for (int i = 1; i < logn; i++) {
			for (int j = 0; j < n; j++) {
				dp[i][j] = dp[i - 1][dp[i - 1][j]];
			}
		}
		for (int i = 0; i < n; i++) {
			if (!vis[i])
				dfs(i);
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			int res = -1;
			int roota = lift(a, dist[a]);
			if (lift(a, dist[a] - dist[b]) == b)
				res = dist[a] - dist[b];
			else if (lift(roota, dist[roota] - dist[b]) == b)
				res = dist[roota] + dist[a] - dist[b];
			output.write(res + "\n");
		}
		output.flush();
	}
}
