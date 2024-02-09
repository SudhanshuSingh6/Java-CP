package CodeChef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class ZOZ {
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
			int m = sc.nextInt();
			long[] arr = new long[n];
			long[] ar = new long[n];
			long k = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextLong();
				k=k+arr[i];
			}
			for (int i = 0; i < n; i++) {
				ar[i] = k - arr[i];
			}
			int c = 0;
			for (int i = 0; i < n; i++) {
				if (m + arr[i] > ar[i]) {
					c++;
				}
			}
			log.write(c+"\n");
		}
		log.flush();
	}
}
