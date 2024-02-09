package CompetitiveProgramming.CSES.Graph;
import java.io.*;
import java.util.*;

public class BuildingRoads {
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

	static class Pair {
		int x;
		int y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static void bfs(ArrayList<ArrayList<Integer>> adj, int v, boolean[] visit) {
		Queue<Integer> q = new LinkedList<>();
		visit[v] = true;
		q.add(v);
		while (!q.isEmpty()) {
			int s = q.peek();
			q.remove();
			for (int u : adj.get(s)) {
				if (visit[u])
					continue;
				visit[u] = true;
				q.add(u);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
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
		ArrayList<Pair> ad = new ArrayList<>();
		bfs(adj, 0, visit);
		for (int i = 1; i < n; i++) {
			if (!visit[i]) {
				ad.add(new Pair(0, i));
				bfs(adj, i, visit);
			}
		}
		System.out.println(ad.size());
		for (int i = 0; i < ad.size(); i++)
			output.write((ad.get(i).x + 1) + " " + (ad.get(i).y + 1) + "\n");
		output.flush();
	}
}
