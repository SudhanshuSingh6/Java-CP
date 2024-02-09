package CodeChef;

import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;;

public class LCPESY {
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
			int[] a = new int[256];
			int[] b = new int[256];
			String A = sc.next();
			String B = sc.next();
			for (char c : A.toCharArray()) {
				a[c]++;
			}
			for (char c : B.toCharArray()) {
				b[c]++;
			}
			int s = 0;
			for (int i = 0; i < 256; i++) {
				s += Math.min(a[i], b[i]);
			}
			log.write(s + "\n");
		}
		log.flush();
	}
}
