package CompetitiveProgramming.CSES.Graph;

import java.util.*;

public class Monsters {
	static class Pair {
		int x;
		int y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	static int n;
	static int m;
	static char[][] mat;
	static Queue<Pair> q;
	static char[][] path;
	static Pair[][] distance;
	static Pair[] dir = { new Pair(0, 1), new Pair(1, 0), new Pair(-1, 0), new Pair(0, -1) };
	static StringBuilder sb = new StringBuilder();
	static boolean isvalid(int x, int y) {
		if (x < 0 || y < 0 || x >= n || y >= m || mat[x][y] == '#')
			return false;
		return true;
	}
	static boolean isEscape(int x, int y) {
		if (x == 0 || y == 0 || x == n - 1 || y == m - 1)
			return true;
		return false;
	}

	static void bfsmonsters() {
		while (!q.isEmpty()) {
			Pair s = q.poll();
			for (Pair a : dir) {
				int x = s.x + a.x;
				int y = s.y + a.y;
				if (!isvalid(x, y) || mat[x][y] == 'M')
					continue;
				mat[x][y] = 'M';
				distance[x][y].x = distance[s.x][s.y].x + 1;
				q.add(new Pair(x, y));
			}
		}
	}

	static void bfsEscape(int x1, int y1, Pair L) {
		mat[x1][y1] = 'A';
		q.add(new Pair(x1, y1));
		while (!q.isEmpty()) {
			Pair s = q.poll();
			for (Pair a : dir) {
				int x = s.x + a.x;
				int y = s.y + a.y;
				if (!isvalid(x, y) || mat[x][y] == 'A')
					continue;
				if (distance[x][y].x != 0 && distance[s.x][s.y].y + 1 >= distance[x][y].x)
					continue;
				if (mat[x][y] == 'M' && distance[x][y].x == 0)
					continue;
				if (mat[s.x][s.y] == 'A') {
					if (a.y == 1)
						path[x][y] = 'R';
					else if (a.x == 1)
						path[x][y] = 'D';
					else if (a.y == -1)
						path[x][y] = 'L';
					else
						path[x][y] = 'U';
					mat[x][y] = 'A';
					distance[x][y].y = distance[s.x][s.y].y + 1;
					if (isEscape(x, y) && mat[x][y] == 'A') {
						L.x = x;
						L.y = y;
						q.clear();
						break;
					}
					q.add(new Pair(x, y));
				}
			}
		}
	}

	static void retrace(int x1, int y1, Pair L) {
		mat[x1][y1] = 'B';
		while (mat[L.x][L.y] != 'B') {
			sb.append(path[L.x][L.y]);
			if (path[L.x][L.y] == 'U')
				L.x++;
			else if (path[L.x][L.y] == 'D')
				L.x--;
			else if (path[L.x][L.y] == 'L')
				L.y++;
			else
				L.y--;
		}
		System.out.println("YES");
		System.out.println(sb.length());
		System.out.println(sb.reverse());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		mat = new char[n][m];
		for (int i = 0; i < n; i++) {
			mat[i] = sc.next().toCharArray();
		}
		int x1 = 0;
		int y1 = 0;
		q = new LinkedList<>();
		distance = new Pair[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mat[i][j] == 'A') {
					mat[i][j] = '.';
					x1 = i;
					y1 = j;
				}
				if (mat[i][j] == 'M') {
					q.add(new Pair(i, j));
				}
				distance[i][j] = new Pair(0, 0);
			}
		}
		Pair L = new Pair(-1, -1);
		path = new char[n][m];
		for (int i = 0; i < n; i++) {
			Arrays.fill(path[i], '-');
		}
		if (x1 == n - 1 || x1 == 0 || y1 == 0 || y1 == n - 1) {
			System.out.println("YES");
			System.out.println(0);
		} else {
			bfsmonsters();
			bfsEscape(x1, y1, L);
			if (L.x == -1 || mat[L.x][L.y] == 'M') {
				System.out.println("NO");
			} else {
				retrace(x1, y1, L);
			}
		}
		sc.close();
	}
}