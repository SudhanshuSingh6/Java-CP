package CompetitiveProgramming.CSES.RangeQueries;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ListRemovals {
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

	static class SegTree {
		int leftM;
		int rightM;
		SegTree left;
		SegTree right;
		int sum;

		SegTree(int leftM, int rightM) {
			this.leftM = leftM;
			this.rightM = rightM;
			if (leftM == rightM) {
				sum = a[leftM];
			} else {
				int mid = leftM + rightM >> 1;
				left = new SegTree(leftM, mid);
				right = new SegTree(mid + 1, rightM);
				calc();
			}
		}

		void calc() {
			if (leftM == rightM)
				return;
			sum = left.sum + right.sum;
		}

		int query(int k) {
			if (sum < k)
				return -1;
			if (leftM == rightM)
				return leftM;
			int ll = left.query(k);
			if (ll != -1)
				return ll;
			return right.query(k - left.sum);
		}

		void update(int idx, int val) {
			if (rightM == leftM) {
				sum -= val;
			} else {
				int mid = rightM + leftM >> 1;
				if (idx <= mid) {
					left.update(idx, val);
				} else {
					right.update(idx, val);
				}
				calc();
			}
		}
	}

	static int[] a;

	static int MOD = (int) 1e9 + 7;

	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		PrintWriter output = new PrintWriter(System.out);
		int n = sc.nextInt();
		int[] nums = new int[n];
		a = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
			a[i] = 1;
		}
		SegTree st = new SegTree(0, n - 1);
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			int idx = st.query(num);
			st.update(idx, 1);
			output.write(nums[idx] + " ");
		}
		output.flush();
		sc.close();
	}
}
