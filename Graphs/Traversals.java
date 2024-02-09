package Graphs;

import java.util.*;

public class Traversals {
    
	static void dfs(int v, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
		visited[v] = true;
		for (int u : adj.get(v)) {
			if (!visited[u])
			{
				dfs(u, visited, adj);
			}
		}
	}
	static void bfs(int v, boolean[] visited, ArrayList<ArrayList<Integer>> adj,Queue<Integer> q) {
		if(!visited[v])
			System.out.println(v);
		visited[v]=true;
		q.add(v);
		while(!q.isEmpty())
		{
			int s = q.peek();
		    q.remove();
			for(int u :adj.get(s))
			{
				if(visited[u])continue;
				System.out.println(u);
				visited[u] =true;
				q.add(u);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<Integer>());
		}
		for (int j = 0; j < m; j++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			adj.get(a).add(b);
			adj.get(b).add(a);
		}
		 boolean[] arr;
		 Queue<Integer> a = new LinkedList<>();
		arr = new boolean[n];
		Arrays.fill(arr, false);
	    bfs(0,arr,adj,a);
	}
}
