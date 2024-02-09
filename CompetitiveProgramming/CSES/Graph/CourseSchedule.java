package CompetitiveProgramming.CSES.Graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CourseSchedule {
	static class FastScanner {
		BufferedReader reader;
		StringTokenizer tokenizer;

		public FastScanner() {
			reader = new BufferedReader(new InputStreamReader(System.in));
			tokenizer = new StringTokenizer("");
		}

		String next() {
			while (!tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return tokenizer.nextToken();
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
			String string = "";
			try {
				string = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return string;
		}
	}

	static class FasterScanner extends FastScanner {
		final private int BUFFER_SIZE = 1 << 12;
		private DataInputStream inputStream;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public FasterScanner() {
			inputStream = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public FasterScanner(String fileName) {
			try {
				inputStream = new DataInputStream(new FileInputStream(fileName));
				buffer = new byte[BUFFER_SIZE];
				bufferPointer = bytesRead = 0;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		String readLine() {
			byte[] buf = new byte[64]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}

		String next() {
			StringBuilder ret = new StringBuilder();
			byte c = read();
			while (c <= ' ')
				c = read();
			do {
				ret.append((char) c);
			} while ((c = read()) > ' ');
			return new String(ret);
		}

		int nextInt() {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}

		long nextLong() {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}

		double nextDouble() {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (c == '.') {
				while ((c = read()) >= '0' && c <= '9') {
					ret += (c - '0') / (div *= 10);
				}
			}
			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() {
			try {
				bytesRead = inputStream.read(buffer, bufferPointer = 0, BUFFER_SIZE);
				if (bytesRead == -1)
					buffer[0] = -1;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		private byte read() {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() {
			if (inputStream == null)
				return;
			try {
				inputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	static void dfs(int s, int[] visit) {
		visit[s] = 1;
		for (int i : adj.get(s)) {
			if (visit[i] == 1)
				continue;
			dfs(i, visit);
		}
		ans.add(s + 1);
	}

	static boolean cycle(int s, int[] visit) {
		visit[s] = 1;
		for (int i : adj.get(s)) {
			if (visit[i] == 0) {
				if (cycle(i, visit))
					return true;
			}
			if (visit[i] == 1)
				return true;
		}
		visit[s] = 2;
		return false;
	}

	static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
	static ArrayList<Integer> ans = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner();
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < n; i++)
			adj.add(new ArrayList<>());
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			adj.get(b - 1).add(a - 1);
		}
		int[] visit = new int[n];
		boolean ok = false;
		for (int i = 0; i < n; i++) {
			if (visit[i] == 0 && cycle(i, visit)) {
				ok = true;
				break;
			}
		}
		if (ok) {
			output.write("IMPOSSIBLE");
		} else {
			Arrays.fill(visit, 0);
			for (int i = 0; i < n; i++) {
				if (visit[i] == 0)
					dfs(i, visit);
			}
			for (int i : ans)
				output.write(i + " ");
		}
		output.flush();
	}
}
