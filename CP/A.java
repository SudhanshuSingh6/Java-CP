package CP;

/*
⠀⠀⠀⠀⣠⣶⡾⠏⠉⠙⠳⢦⡀⠀⠀⠀⢠⠞⠉⠙⠲⡀⠀
⠀⠀⠀⣴⠿⠏⠀⠀⠀⠀⠀⠀⢳⡀⠀ ⡏ ⠀ S⠀  ⢷
⠀⠀⢠⣟⣋⡀⢀⣀⣀⡀⠀⣀⡀⣧⠀⢸⠀   I⠀⠀⡇
⠀⠀⢸⣯⡭⠁⠸⣛⣟⠆⡴⣻⡲⣿⠀⣸⠀⠀ N⠀  ⡇
⠀⠀⣟⣿⡭⠀⠀⠀⠀⠀⢱⠀⠀⣿⠀⢹⠀⠀ G⠀  ⡇
⠀⠀⠙⢿⣯⠄⠀⠀⠀⢀⡀⠀⠀⡿⠀⠀⡇⠀ H⠀ ⡼
⠀⠀⠀⠀⠹⣶⠆⠀⠀⠀⠀⠀⡴⠃⠀⠀⠘⠤⣄⣠⠞⠀
⠀⠀⠀⠀⠀⢸⣷⡦⢤⡤⢤⣞⣁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⢀⣤⣴⣿⣏⠁⠀⠀⠸⣏⢯⣷⣖⣦⡀⠀⠀⠀⠀⠀⠀
⢀⣾⣽⣿⣿⣿⣿⠛⢲⣶⣾⢉⡷⣿⣿⠵⣿⠀⠀⠀⠀⠀⠀
⣼⣿⠍⠉⣿⡭⠉⠙⢺⣇⣼⡏⠀⠀⠀⣄⢸⠀⠀⠀⠀⠀⠀
⣿⣿⣧⣀⣿………⣀⣰⣏⣘⣆⣀⠀⠀
 */
import java.io.*;
import java.util.*;

public class A {
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

	static class Triplet {
		long x;
		long y;
		long z;

		public Triplet(long x, long y, long z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}

	static long gcd(long n, long m) {
		if (m == 0)
			return n;
		else
			return gcd(m, n % m);
	}

	static long lcm(long n, long m) {
		return (n * m) / gcd(n, m);
	}

	public static long solve(long a, long b, long x, long y, long n) {
		if (a - n >= x) {
			return ((a - n) * b);
		} else {
			n -= a - x;
			a = x;
			if (b - n >= y) {
				return (a * (b - n));
			} else {
				b = y;
				return (a * b);
			}
		}
	}

	static int high(int n) {
		int p = (int) (Math.log(n) / Math.log(2));
		return (int) Math.pow(2, p);
	}

	static boolean prime(int n) {
		int m = (int) Math.sqrt(n);
		for (int i = 2; i <= m; i++)
			if (n % i == 0)
				return false;
		return true;
	}

	static int lbs(long a[], int high) { // x is the target value or key
		int l = 0, r = high;
		while (l <= r) {
			int m = (l + r) / 2;
			if (a[m] < m)
				l = m + 1;
			else
				r = m - 1;
		}
		return r + 1;
	}

	static int ubs(long a[], int high) {// x is the key or target value
		int l = 0, r = high;
		while (l <= r) {
			int m = (l + r) / 2;
			if (a[m] > m)
				r = m - 1;
			else
				l = m + 1;
		}
		return r + 1;
	}

	static boolean ok(int n, int m) {
		if (n == m)
			return true;
		else if (n % 3 != 0)
			return false;
		return (ok(n / 3, m) || ok(2 * n / 3, m));
	}

	static int find(int x, ArrayList<Integer> v) {
		int l = 0;
		int r = v.size();
		while (l < r) {
			int mid = (l + r) >>> 1;
			if (v.get(mid) > x)
				r = mid;
			else
				l = mid + 1;
		}
		return l;
	}

	static void dfs(int s, int p, ArrayList<ArrayList<Integer>> adj, int[] dp) {
		for (int i : adj.get(s)) {
			if (i == p)
				continue;
			dp[i] += dp[s] + 1;
			dfs(i, s, adj, dp);
		}
	}

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

//1 1 1 2 2 2
	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		PrintWriter output = new PrintWriter(System.out);
		int tt = sc.nextInt();
		for (int xx = 0; xx < tt; xx++) {
			int n = sc.nextInt();
			int[] x = new int[n];
			int[] p = new int[n];

			for (int i = 0; i < n; i++) {
				x[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				p[i] = sc.nextInt();
			}
			int reach = x[0] + p[0];
			int[] right = new int[n];
			int c = 0;
			for (int i = 1; i < n; i++) {
				if (reach >= x[i]) {
					reach = x[i] + p[i];
					right[c] = i;
					// right[i] = i;
				} else {
					c = i;
					reach = x[i] + p[i];
				}
			}
			int[] left = new int[n];
			reach = x[n - 1] - p[n - 1];
			c = n - 1;
			for (int i = n - 2; i >= 0; i--) {
				if (reach <= x[i]) {
					reach = x[i] - p[i];
					left[c] = i;
					// left[i] = i;
				} else {
					c = i;
					reach = x[i] - p[i];
				}
			}
			for (int i = 0; i < n; i++) {
				int k = i;
				while (k <= right[i]) {
					right[k] = right[i];
					k++;
				}
				if (right[i] != 0)
					i = right[i];
			}
			for (int i = n - 1; i >= 0; i--) {
				int k = i;
				while (k >= left[i]) {
					left[k] = left[i];
					k--;
				}
				if (left[i] != 0)
					i = left[i];
			}

			int zero1 = 0;
			int zero2 = 0;
			for (int i = 0; i < n; i++) {
				if (left[i] == 0)
					zero1++;
				if (right[i] == 0)
					zero2++;
				if (left[i] == 1)
					zero1 = -n;
				if (right[i] == n)
					zero2 = -n;
			}
			int[] freq1 = new int[n];
			int[] freq2 = new int[n];
			freq1[0] = 1;
			freq2[n - 1] = 1;
			for (int i = 0; i < n - 1; i++) {
				if (freq1[i] != freq1[i + 1]) {
					freq1[i + 1] = freq1[i] + 1;
				}
			}
			for (int i = n - 1; i >= 1; i--) {
				if (freq2[i] != freq2[i - 1]) {
					freq2[i - 1] = freq2[i] + 1;
				}
			}
			System.out.println(Arrays.toString(freq1));
			System.out.println(Arrays.toString(freq2));
			boolean ok = false;
			if ((zero1 >= n - 2 && zero1 != n) || (zero2 >= n - 2 && zero2 != n))
				output.write("YES" + "\n");
			else {
				c = n - 1;
				for (int i = 0; i < n; i++) {
					if (i + 1 < n) {
						if (freq1[i] + freq2[i + 1] <= 2 || freq1[i] + freq1[i+1] <= 2)
							ok = true;
						break;
					}
					c--;
				}
				if (ok)
					output.write("YES" + "\n");
				else
					output.write("NO" + "\n");
			}
		}
		output.flush();
		sc.close();
	}
}