package CompetitiveProgramming.CSES.Graph;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class MessageRoute {
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

	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < n; i++)
			adj.add(new ArrayList<>());
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			a--;
			b--;
			adj.get(a).add(b);
			adj.get(b).add(a);
		}
		boolean[] visit = new boolean[n];
		Arrays.fill(visit, false);
		int[] from = new int[n];
		int[] route = new int[n];
		Queue<Integer> q = new LinkedList<>();
		q.add(0);
		while (!q.isEmpty()) {
			int p = q.poll();
			visit[p] = true;
			for (int a : adj.get(p)) {
				if (visit[a])
					continue;
				from[a] = p;
				visit[a] = true;
				q.add(a);
			}
		}
		if (!visit[n - 1])
			System.out.println("IMPOSSIBLE");
		else {
			int a = n - 1;
			int c = 0;
			route[c] = a + 1;
			while (a != 0) {
				a = from[a];
				c++;
				route[c] = a + 1;
			}
			out.println(c + 1);
			for (int i = c; i >= 0; i--)
				out.print(route[i] + " ");
			out.flush();
		}
	}
}
