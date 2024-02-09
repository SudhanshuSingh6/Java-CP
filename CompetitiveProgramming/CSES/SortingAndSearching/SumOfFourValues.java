package CompetitiveProgramming.CSES.SortingAndSearching;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SumOfFourValues {
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

	static class Pair {
		int x;
		int y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int MOD = (int) 1e9 + 7;

	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		PrintWriter output = new PrintWriter(System.out);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		HashMap<Integer, Pair> map = new HashMap<>();
		boolean ok = false;
		outer: for (int i = n - 1; i >= 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				int rem = x - (arr[i] + arr[j]);
				if (map.containsKey(rem)) {
					output.write((i + 1) + " " + (j + 1) + " " + (map.get(rem).x + 1) + " " + (map.get(rem).y + 1));
					ok = true;
					break outer;
				}
			}
			for (int j = i + 1; j < n; j++) {
				map.put(arr[i] + arr[j], new Pair(i, j));
			}
		}
		if (!ok)
			output.write("IMPOSSIBLE");
		output.flush();
		sc.close();
	}
}
