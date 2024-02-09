package CompetitiveProgramming.CSES.SortingAndSearching;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class RoomAllocation {
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

	static int bs(ArrayList<Integer> a, int x) {
		int low = 0;
		int high = a.size() - 1;
		int idx = -1;
		while (low <= high) {
			int mid = low + high >> 1;
			if (a.get(mid) > x) {
				high = mid - 1;
			} else {
				low = mid + 1;
				idx = mid;
			}
		}
		return idx;
	}

	static class Customer {
		int a;
		int d;
		int id;

		Customer(int a, int d, int id) {
			this.a = a;
			this.d = d;
			this.id = id;
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
		Customer[] customer = new Customer[n];
		for (int i = 0; i < n; i++) {
			customer[i] = new Customer(sc.nextInt(), sc.nextInt(), i);
		}
		int[] ans = new int[n];
		PriorityQueue<Pair> pq = new PriorityQueue<>((p, q) -> Integer.compare(p.x, q.x));
		Arrays.sort(customer, (p, q) -> Integer.compare(p.a, q.a));
		pq.add(new Pair(customer[0].d, 1));
		ans[customer[0].id] = 1;
		for (int i = 1; i < n; i++) {
			if (pq.peek().x < customer[i].a) {
				ans[customer[i].id] = pq.peek().y;
				pq.poll();
				pq.add(new Pair(customer[i].d, ans[customer[i].id]));
			} else {
				ans[customer[i].id] = pq.size() + 1;
				pq.add(new Pair(customer[i].d, ans[customer[i].id]));
			}
		}
		output.write(pq.size() + "\n");
		for (int i : ans)
			output.write(i + " ");
		output.flush();
	}
}