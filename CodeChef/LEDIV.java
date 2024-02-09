package CodeChef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class LEDIV {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
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
	}

	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			int k = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				if (k > arr[i])
					k = arr[i];
			}
			if (k == 1) {
				log.write(-1+"\n");
			} else {
				int m = 1;
				for (int i = 2; i <= k; i++) {
					if (k % i == 0) {
						k = i;
						break;
					}
				}
				for (int i = 0; i < n; i++) {
					if (arr[i] % k != 0) {
						m = 0;
						break;
					}
				}
				if (m == 0)
					log.write(-1 + "\n");
				else
					log.write(k + "\n");
			}
			log.flush();
		}
	}
}
