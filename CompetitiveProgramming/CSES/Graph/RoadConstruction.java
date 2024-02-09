package CompetitiveProgramming.CSES.Graph;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class RoadConstruction {
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

	static class Edge {
		int u;
		int v;
		int w;

		Edge(int u, int v, int w) {
			this.u = u;
			this.v = v;
			this.w = w;
		}
	}

	static void make(int n) {
		for (int i = 0; i < n; i++) {
			parent[i] = i;
			size[i] = 1;
		}
	}

	static int find(int v) {
		while (v != parent[v]) {
			parent[v] = parent[parent[v]];
			v = parent[v];
		}
		return v;
	}

	static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if (a != b) {
			if (size[a] > size[b]) {
				parent[b] = a;
				size[a] += size[b];
			} else {
				parent[a] = b;
				size[b] += size[a];
			}
			max = Math.max(size[a], Math.max(size[b], max));
		}
	}

	static int[] parent;
	static int[] size;
	static int max;

	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		PrintWriter output = new PrintWriter(System.out);
		int n = sc.nextInt();
		int m = sc.nextInt();
		parent = new int[n];
		size = new int[n];
		max = 0;
		make(n);
		int cnt = n;
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			if (find(a) == find(b)) {
				output.write(cnt + " " + max + "\n");
			} else {
				cnt--;
				union(a, b);
				output.write(cnt + " " + max + "\n");
			}
		}
		output.flush();
	}
}
