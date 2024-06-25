//package CompetitiveProgramming.CSES.SortingAndSearching;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class TrafficLights {
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

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int MOD = (int) 1e9 + 7;

	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		PrintWriter output = new PrintWriter(System.out);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int[] lights = new int[n];
		TreeMap<Integer, Pair> map = new TreeMap<>();
		TreeMap<Integer, Integer> cnt = new TreeMap<>();
		map.put(0, new Pair(0, x));
		map.put(x, new Pair(x, 0));
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(-x);
		pq.add(-x);
		// pq.add(-0);
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int f = map.floorKey(a);
			int c = map.ceilingKey(a);
			// System.out.println(i + " " + a + " " + f + " " + c);
			int l = a - f;
			int r = c - a;
			// map.put(a, new Pair(l, r));
			// System.out.println(-map.get(f).y + " " + -map.get(c).x);
			// if (pq.contains(-map.get(f).y))
			// pq.remove(-map.get(f).y);
			cnt.put(map.get(f).y, cnt.get(map.get(f).y) - 1);
			// if (pq.contains(-map.get(c).x))
			// pq.remove(-map.get(c).x);
			cnt.put(map.get(c).x, cnt.get(map.get(c).x) - 1);
			map.put(f, new Pair(map.get(f).x, l));
			map.put(c, new Pair(r, map.get(c).y));
			map.put(a, new Pair(l, r));
			// System.out.println(l+" "+r);
			cnt.put(l, cnt.getOrDefault(l, 0) + 1);
			cnt.put(r, cnt.getOrDefault(l, 0) + 1);
			//pq.add(-r);
			pq.add(-map.get(f).x);
			pq.add(-map.get(c).x);
			// System.out.println(pq);
			// pq.remove(0);
			// for (int j : map.keySet())
			// System.out.println(j + " " + map.get(j).x + " " + map.get(j).y);
			output.write(-pq.peek() + "\n");
		}
		output.flush();
	}
}
