package CompetitiveProgramming.CSES.Graph;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class HighScore {
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

	static ArrayList<Triplet> adj;
	static int n;
	static long[] dist;
	static int[] parent;
	static long INF = (long) 1e17;
	static long NINF = -INF;

	public static void main(String[] args) throws IOException {
		Reader sc = new Reader();
		n = sc.nextInt();
		int m = sc.nextInt();
		adj = new ArrayList<>();
		dist = new long[n];
		Arrays.fill(dist, INF);
		for (int i = 0; i < m; i++) {
			adj.add(new Triplet(sc.nextInt() - 1, sc.nextInt() - 1, -sc.nextInt()));
		}
		dist[0] = 0;
		boolean ok;
		for (int i = 1; i < n; i++) {
			ok = false;
			for (int j = 0; j < m; j++) {
				int u = adj.get(j).x;
				int v = adj.get(j).y;
				long d = adj.get(j).z;
				if (dist[u] == INF)
					continue;
				long d1 = d + dist[u];
				if (d1 < dist[v]) {
					dist[v] = Math.min(dist[v], d + dist[u]);
					ok = true;
				}
				dist[v] = Math.max(dist[v], NINF);
			}
			if (!ok)
				break;
		}
		for (int i = 1; i < n; i++) {
			ok = false;
			for (int j = 0; j < m; j++) {
				int u = adj.get(j).x;
				int v = adj.get(j).y;
				long d = adj.get(j).z;
				if (dist[u] == INF)
					continue;
				dist[v] = Math.max(dist[v], NINF);
				if (dist[u] + d < dist[v]) {
					dist[v] = NINF;
					ok = true;
				}
			}
			if (!ok)
				break;
		}
		if (dist[n - 1] == NINF)
			System.out.println(-1);
		else {
			System.out.println(-dist[n - 1]);
		}
		sc.close();
	}
}