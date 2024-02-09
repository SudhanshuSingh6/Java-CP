package CompetitiveProgramming.CSES.Graph;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ShortestRoutesI {
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

	public static class Pair {
		int x;
		Long y;

		Pair(int x, Long y) {
			this.x = x;
			this.y = y;
		}
	}

	static void shortestPath(int s, int n, long[] dist, ArrayList<ArrayList<Pair>> adj) {
		dist[s] = 0;
		boolean[] visited = new boolean[n];
		PriorityQueue<Pair> q = new PriorityQueue<>(new Comparator<Pair>() {
			@Override
			public int compare(Pair a, Pair b) {
				if (a.y > b.y)
					return 1;
				return -1;
			}
		});
		q.add(new Pair(s, 0L));
		while (!q.isEmpty()) {
			Pair u = q.poll();
			if (visited[u.x])
				continue;
			visited[u.x] = true;
			for (Pair i : adj.get(u.x)) {
				long k = dist[u.x] + i.y;
				if (k < dist[i.x]) {
					dist[i.x] = k;
					q.add(new Pair(i.x, dist[i.x]));
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Reader sc = new Reader();
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] dist = new long[n];
		ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<>());
			dist[i] = Long.MAX_VALUE;
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			a--;
			b--;
			adj.get(a).add(new Pair(b, (long) sc.nextInt()));
		}
		shortestPath(0, n, dist, adj);
		StringBuilder sb = new StringBuilder();
		for (long i : dist)
			sb.append(i).append(" ");
		System.out.println(sb);
	}
}