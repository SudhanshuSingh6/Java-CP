package CompetitiveProgramming.CSES.Graph;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Vector;

public class Investigation {
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

	static void dij() {
		q.add(new Pair(0, 0));
		while (!q.isEmpty()) {
			Pair u = q.poll();
			if (u.y > dist[u.x])
				continue;
			for (Pair v : adj.get(u.x)) {
				if (v.y + u.y > dist[v.x])
					continue;
				else if (v.y + u.y < dist[v.x]) {
					dist[v.x] = u.y + v.y;
					routes[v.x] = routes[u.x];
					max[v.x] = max[u.x] + 1;
					min[v.x] = min[u.x] + 1;
					q.add(new Pair(v.x, dist[v.x]));
				} else {
					routes[v.x] = (routes[v.x] + routes[u.x]) % MOD;
					max[v.x] = Math.max(max[v.x], max[u.x] + 1);
					min[v.x] = Math.min(min[v.x], min[u.x] + 1);
				}
			}
		}
	}

	static PriorityQueue<Pair> q = new PriorityQueue<>((p1, p2) -> Long.compare(p1.y, p2.y));
	static long[] dist;
	static long[] routes;
	static int[] max;
	static int[] min;
	static Vector<Vector<Pair>> adj;
	static long MOD = (long) 1e9 + 7;

	public static void main(String[] args) throws IOException {
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		Reader sc = new Reader();
		int n = sc.nextInt();
		int m = sc.nextInt();
		dist = new long[n];
		max = new int[n];
		min = new int[n];
		routes = new long[n];
		adj = new Vector<>();
		Arrays.fill(dist, (long) 1e17);
		dist[0] = 0;
		routes[0] = 1;
		for (int i = 0; i < n; i++)
			adj.add(new Vector<>());
		for (int i = 0; i < m; i++) {
			adj.get(sc.nextInt() - 1).add(new Pair(sc.nextInt() - 1, sc.nextLong()));
		}
		dij();
		output.write(dist[n - 1] + " " + routes[n - 1] + " " + min[n - 1] + " " + max[n - 1]);
		output.flush();
		sc.close();
	}
}