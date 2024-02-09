package CompetitiveProgramming.CSES.TreeAlgorithms;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

public class DistanceQueries {
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

	static void bfs() {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { 0, 0 });
		while (!q.isEmpty()) {
			int[] curr = q.poll();
			vis[curr[0]] = true;
			for (int i : adj.get(curr[0])) {
				if (vis[i])
					continue;
				dp[0][i] = curr[0];
				depth[i] = curr[1] + 1;
				q.add(new int[] { i, depth[i] });
			}
		}
	}

	static int dist(int u, int v) {
		int ans = 0;
		if (depth[u] < depth[v]) {
			int temp = u;
			u = v;
			v = temp;
		}
		int k = depth[u] - depth[v];
		u = lift(k, u);
		if (u == v)
			return k;
		for (int i = logn - 1; i >= 0; i--) {
			if (dp[i][u] != dp[i][v]) {
				ans += pow[i];
				u = dp[i][u];
				v = dp[i][v];
			}
		}
		return k + ((ans + 1) * 2);
	}

	static int lift(int k, int x) {
		int j = 0;
		while (k > 0) {
			if ((k & 1) == 1) {
				x = dp[j][x];
			}
			k >>= 1;
			j++;
		}
		return x;
	}

	static int logn = 18;
	static int[][] dp;
	static int[] depth;
	static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
	static boolean[] vis;
	static int[] pow = new int[logn];

	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		PrintWriter output = new PrintWriter(System.out);
		pow[0] = 1;
		for (int i = 1; i < logn; i++) {
			pow[i] = pow[i - 1] * 2;
		}
		int n = sc.nextInt();
		int m = sc.nextInt();
		dp = new int[logn][n];
		depth = new int[n];
		vis = new boolean[n];
		Arrays.fill(vis, false);
		for (int i = 0; i < n; i++)
			adj.add(new ArrayList<>());
		for (int i = 1; i < n; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			adj.get(a).add(b);
			adj.get(b).add(a);
		}
		bfs();
		for (int i = 1; i < logn; i++) {
			for (int j = 1; j < n; j++) {
				dp[i][j] = dp[i - 1][dp[i - 1][j]];
			}
		}
		for (int i = 0; i < m; i++) {
			int u = sc.nextInt() - 1;
			int v = sc.nextInt() - 1;
			output.write(dist(u, v) + "\n");
		}
		output.flush();
	}
}