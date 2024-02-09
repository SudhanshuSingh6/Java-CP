package CompetitiveProgramming.CSES.Graph;

import java.util.*;

public class Labyrinth {
	static class Pair {
		int x;
		int y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static boolean isvalid(char[][] mat, int i, int j, int n, int m) {
		if (i >= n || i < 0 || j >= m || j < 0 || mat[i][j] == '#')
			return false;
		return true;
	}

	static boolean bfs(int i, int j, char[][] mat, int n, int m, char[][] S, boolean k) {
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(i, j));
		mat[i][j] = '#';
		Pair[] dir = { new Pair(0, 1), new Pair(-1, 0), new Pair(0, -1), new Pair(1, 0) };
		while (!q.isEmpty()) {
			Pair s = q.poll();
			for (Pair a : dir) {
				int x = a.x + s.x;
				int y = a.y + s.y;
				if (isvalid(mat, x, y, n, m)) {
					q.add(new Pair(x, y));
					if (a.y == 1)
						S[x][y] = 'R';
					else if (a.x == 1)
						S[x][y] = 'D';
					else if (a.y == -1)
						S[x][y] = 'L';
					else
						S[x][y] = 'U';
					mat[x][y] = '#';
				}
			}
		}
		return k;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] mat = new char[n][m];
		for (int i = 0; i < n; i++)
			mat[i] = sc.next().toCharArray();
		int c = 0;
		StringBuilder s = new StringBuilder();
		char[][] dir = new char[n][m];
		boolean a = true;
		int x = 0;
		int y = 0;
		int x1 = 0;
		int y1 = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mat[i][j] == 'A') {
					x = i;
					y = j;
				}
				if (mat[i][j] == 'B') {
					x1 = i;
					y1 = j;
				}
			}
			if (c == 1)
				break;
		}
		bfs(x, y, mat, n, m, dir, a);
		mat[x][y] = 'A';
		if (mat[x1][y1] == '#') {
			while (mat[x1][y1] != 'A') {
				s.append(dir[x1][y1]);
				if (dir[x1][y1] == 'U')
					x1++;
				else if (dir[x1][y1] == 'D')
					x1--;
				else if (dir[x1][y1] == 'L')
					y1++;
				else
					y1--;
			}
			System.out.println("YES");
			System.out.println(s.length());
			System.out.println(s.reverse());
		} else
			System.out.println("NO");

		sc.close();
	}
}
