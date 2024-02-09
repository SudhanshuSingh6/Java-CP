package CompetitiveProgramming.CSES.Graph;

import java.util.*;

public class CountingRooms {
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
	static void bfs(int i,int j,char[][] mat,int n,int m) {
		Queue<Pair> q = new LinkedList<>();
		mat[i][j]='#';
		q.add(new Pair(i,j));
		Pair[] dir = {new Pair(0,1),new Pair(-1,0),new Pair(0,-1),new Pair(1,0)};
		while(!q.isEmpty())
		{
			Pair s = q.poll();
		    for(Pair a: dir)
		    {
		    	int x = a.x+s.x;
		    	int y = a.y+s.y;
		    	if(isvalid(mat,x,y,n,m))
		    	{
		    		q.add(new Pair(x,y));
		    		mat[x][y]='#';
		    	}
		    }
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] mat = new char[n][m];
		for (int i = 0; i < n; i++)
			mat[i] = sc.next().toCharArray();
		int c = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (mat[i][j] == '.') {
						bfs(i, j,mat, n, m);
						c++;
					}
				}
			}
		System.out.println(c);
		sc.close();
	}
}
