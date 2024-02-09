package CompetitiveProgramming.CSES.Graph;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class CoinCollector {
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

	static void dfs1(int s) {
		vis[s] = true;
		for (int i : adj.get(s)) {
			if (vis[i])
				continue;
			dfs1(i);
		}
		stack.add(s);
	}

	static void dfs2(int s) {
		vis[s] = true;
		ans[s] = c;
		for (int i : adj_rev.get(s)) {
			if (vis[i])
				continue;
			dfs2(i);
		}
	}

	static boolean[] vis;
	static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
	static ArrayList<ArrayList<Integer>> adj_rev = new ArrayList<>();
	static Stack<Integer> stack = new Stack<>();
	static int[] coins;
	static int[] ans;
	static int c = 1;

	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		PrintWriter output = new PrintWriter(System.out);
		int n = sc.nextInt();
		int m = sc.nextInt();
		vis = new boolean[n];
		coins = new int[n];
		for (int i = 0; i < n; i++)
			coins[i] = sc.nextInt();
		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<>());
			adj_rev.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			adj.get(a).add(b);
			adj_rev.get(b).add(a);
		}
		Arrays.fill(vis, false);
		for (int i = 0; i < n; i++) {
			if (!vis[i])
				dfs1(i);
		}
		Arrays.fill(vis, false);
		ans = new int[n];
		while (!stack.isEmpty()) {
			int i = stack.pop();
			if (vis[i])
				continue;
			dfs2(i);
			c++;
		}
		output.write(c - 1 + "\n");
		for (int i : ans)
			output.write(i + " ");
		output.flush();
	}
}
