package Graphs;

import java.util.*;

public class Dijkstra {
	public static class Node implements Comparator<Node> {
		int v;
		int weight;

		Node(int v1, int w1) {
			v = v1;
			weight = w1;
		}

		Node() {
		}

		int getV() {
			return v;
		}

		int getWeight() {
			return weight;
		}

		@Override
		public int compare(Node n1, Node n2) {
			if (n1.weight < n2.weight)
				return -1;
			if (n1.weight > n1.weight)
				return 1;
			return 0;
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
	public int bfs(int x,int y,char[][] maze,int[][] ans,int c,int n,int m)
    {
        //System.out.println((x>=n)+" "+(y>=n)+" "+(y<0)+" "+(x<0)+" "+(maze[x][y]=='+')+" "+(ans[x][y]>0));
        if(x>=n||y>=m||y<0||x<0||maze[x][y]=='+')
            return Integer.MAX_VALUE;
        if(ans[x][y]!=0)
        	return ans[x][y];
        ans[x][y] = Math.min(bfs(x-1,y,maze,ans,ans[x][y]+1,n,m),Math.min(bfs(x+1,y,maze,ans,ans[x][y]+1,n,m),Math.min(bfs(x,y+1,maze,ans,ans[x][y]+1,n,m),bfs(x,y-1,maze,ans,ans[x][y]+1,n,m))));
        return ans[x][y];
    }
	static void shortestPath1(int s, ArrayList<ArrayList<Pair>> adj, int n) {
		PriorityQueue<Pair> q = new PriorityQueue<>((a, b) -> a.y - b.y);
		boolean visited[] = new boolean[n];
		q.add(new Pair(0, 0));
		int ans = -1;
		while (!q.isEmpty()) {
			Pair a = q.poll();
			if (visited[a.x])
				continue;
			if (a.x == n - 1) {
				ans = a.y;
				break;
			}
			visited[a.x] = true;
			for (Pair v : adj.get(a.x)) {
				if (visited[v.x] == false) {
					q.add(new Pair(v.x, v.y + a.y));
				}
			}
		}
		System.out.println(ans);
	}

	static void shortestPath(int s, ArrayList<ArrayList<Node>> adj, int n) {
		int dist[] = new int[n];
		for (int i = 0; i < n; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		dist[s] = 0;
		PriorityQueue<Node> q = new PriorityQueue<Node>(n, new Node());
		q.add(new Node(s, 0));
		while (!q.isEmpty()) {
			Node node = q.poll();
			for (Node i : adj.get(node.getV())) {
				if (dist[node.getV()] + i.getWeight() < dist[i.getV()]) {
					dist[i.getV()] = dist[node.getV()] + i.getWeight();
					q.add(new Node(i.getV(), dist[i.getV()]));
				}
			}
		}
		System.out.println(dist[n - 1]);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<ArrayList<Node>> adj = new ArrayList<>();
		ArrayList<ArrayList<Pair>> ad = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<>());
			ad.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			int u = sc.nextInt();// 0 based or 1 based
			int v = sc.nextInt();
			u--;
			v--;
			adj.get(u).add(new Node(v, 1));
			adj.get(v).add(new Node(u, 1));
			ad.get(u).add(new Pair(v, 1));
			ad.get(v).add(new Pair(u, 1));
		}

		shortestPath(0, adj, n);
		shortestPath1(0, ad, n);
		sc.close();
	}
}
