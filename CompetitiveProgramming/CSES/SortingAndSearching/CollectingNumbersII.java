package CompetitiveProgramming.CSES.SortingAndSearching;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class CollectingNumbersII {
	static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public Reader(String file_name) throws IOException {
			din = new DataInputStream(new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String readLine() throws IOException {
			byte[] buf = new byte[64]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n') {
					if (cnt != 0) {
						break;
					} else {
						continue;
					}
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

		public long nextLong() throws IOException {
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

		public double nextDouble() throws IOException {
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

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException {
			if (din == null)
				return;
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

	public static void main(String[] args) throws IOException {
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		Reader sc = new Reader();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		int[] bb = new int[n];
		for (int i = 0; i < n; i++) {
			bb[i] = sc.nextInt();
			arr[bb[i] - 1] = i;
		}
		int ans = 1;
		for (int i = 1; i < n; i++) {
			if (arr[i] < arr[i - 1])
				ans++;
		}
		// System.out.println(ans);
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < m; i++) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			int a = arr[bb[c - 1]];
			int b = arr[bb[d - 1]];
			if (a == b) {
				output.write(ans + "\n");
				continue;
			}
			if (a - 1 >= 0 && arr[a] < arr[a - 1])
				ans--;
			if (a + 1 < n && arr[a + 1] < arr[a])
				ans--;
			if (b - 1 >= 0 && arr[b] < arr[b - 1])
				ans--;
			if (b + 1 < n && arr[b + 1] < arr[b])
				ans--;
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
			temp = bb[c - 1];
			bb[c - 1] = bb[d - 1];
			bb[d - 1] = temp;
			System.out.println(ans);
			if (a - 1 >= 0 && arr[a] < arr[a - 1])
				ans++;
			if (a + 1 < n && arr[a + 1] < arr[a])
				ans++;
			if (b - 1 >= 0 && arr[b] < arr[b - 1])
				ans++;
			if (b + 1 < n && arr[b + 1] < arr[b])
				ans++;
			System.out.println(Arrays.toString(arr));
			output.write(ans + "\n");
		}
		output.flush();
		sc.close();
	}
}
