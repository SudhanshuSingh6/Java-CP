package Graphs;

import java.util.*;

public class MultiSourceBfs {
	static class Pair {
		int x;
		int y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static boolean isvalid(int i, int j, int n, int m) {
		return i >= 0 && j >= 0 && i < n && j < m;
	}

	static int bfs(int ans, int max, int n, int m, int[][] level, boolean[][] vis, int[][] ar) {
		Pair[] move = { new Pair(0, 1), new Pair(-1, 1), new Pair(1, -1), new Pair(1, 1), new Pair(-1, -1),
				new Pair(0, -1), new Pair(-1, 0), new Pair(1, 0) };
		Queue<Pair> q = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (ar[i][j] == max) {
					q.add(new Pair(i, j));
					vis[i][j] = true;
					level[i][j] = 0;
				}
			}
		}
		while (!q.isEmpty()) {
			Pair v = q.peek();
			int x = v.x;
			int y = v.y;
			q.remove();
			for (Pair w : move) {
				int x1 = w.x + x;
				int y1 = w.y + y;
				if (!isvalid(x1, y1, n, m))
					continue;
				if (vis[x1][y1])
					continue;
				q.add(new Pair(x1, y1));
				level[x1][y1] = level[x][y] + 1;
				vis[x1][y1] = true;
				ans = Math.max(ans, level[x1][y1]);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int ar[][] = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					ar[i][j] = sc.nextInt();
				}
			}
			int[][] level = new int[n][m];
			boolean[][] vis = new boolean[n][m];
			int max = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					max = Math.max(ar[i][j], max);
				}
			}
			int ans = 0;
			str.append(bfs(ans, max, n, m, level, vis, ar) + "\n");
		}
		System.out.println(str);
		sc.close();
	}
}