package CompetitiveProgramming.CSES.RangeQueries;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class RangeUpdateQueries {
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

	static class SegTree {
		int leftM;
		int rightM;
		SegTree left;
		SegTree right;
		long sum;

		SegTree(int leftM, int rightM) {
			this.leftM = leftM;
			this.rightM = rightM;
			if (leftM == rightM) {
				sum = diff[leftM];
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

		long query(int l, int r) {
			if (r < leftM || l > rightM)
				return 0;
			if (l <= leftM && r >= rightM) {
				return sum;
			}
			return left.query(l, r) + right.query(l, r);
		}

		void update(int idx, int val) {
			if (rightM == leftM) {
				sum += val;
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

	static int[] diff;

	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		PrintWriter output = new PrintWriter(System.out);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		diff = new int[n];
		diff[0] = a[0];
		for (int i = 1; i < n; i++) {
			diff[i] = a[i] - a[i - 1];
		}
		SegTree st = new SegTree(0, n - 1);
		for (int i = 0; i < q; i++) {
			int t = sc.nextInt();
			if (t == 1) {
				int l = sc.nextInt() - 1;
				int r = sc.nextInt();
				int u = sc.nextInt();
				st.update(l, u);
				if (r < n)
					st.update(r, -u);
			} else {
				int l = sc.nextInt() - 1;
				output.write(st.query(0, l) + "\n");
			}
		}
		output.flush();
	}
}
