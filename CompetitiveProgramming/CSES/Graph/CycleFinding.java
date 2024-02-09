package CompetitiveProgramming.CSES.Graph;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class CycleFinding {
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
		long y;

		public Pair(int x, long y) {
			this.x = x;
			this.y = y;
		}
	}

	static class Triplet {
		int x;
		int y;
		long z;

		public Triplet(int x, int y, long z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}

	static void bellmanford(Triplet[] edges, long[] dist, int[] path) {
		for (int i = 1; i <= dist.length + 1; i++) {
			x = -1;
			for (Triplet e : edges) {
				int u = e.x;
				int v = e.y;
				long d = e.z;
				if (dist[u] + d < dist[v]) {
					dist[v] = d + dist[u];
					path[v] = u;
					x = v;
				}
			}
		}
	}

	static int x;

	public static void main(String[] args) throws IOException {
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		Reader sc = new Reader();
		int n = sc.nextInt();
		int m = sc.nextInt();
		Triplet[] edges = new Triplet[m];
		for (int i = 0; i < m; i++)
			edges[i] = new Triplet(sc.nextInt() - 1, sc.nextInt() - 1, sc.nextLong());
		long[] dist = new long[n];
		int[] path = new int[n];
		Arrays.fill(path, -1);
		Arrays.fill(dist, (long) 5e14);
		dist[0] = 0;
		bellmanford(edges, dist, path);
		if (x == -1) {
			output.write("NO" + "\n");
		} else {
			// System.out.println(Arrays.toString(path) + " " + Arrays.toString(dist));
			for (int i = 1; i <= n + 1; i++)
				x = path[x];
			ArrayList<Integer> cycle = new ArrayList<>();
			for (int v = x;; v = path[v]) {
				cycle.add(v + 1);
				if (v == x && cycle.size() > 1)
					break;
			}
			// System.out.println(Arrays.toString(path) + " " + x + " " + cycle);
			Collections.reverse(cycle);
			output.write("YES" + "\n");
			for (int i : cycle)
				output.write(i + " ");
		}
		output.flush();
		sc.close();
	}
}