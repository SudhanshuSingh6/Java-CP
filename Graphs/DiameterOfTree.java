package Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class DiameterOfTree {
	static void dfs(int v, int par, int[] depth, ArrayList<ArrayList<Integer>> adj) {
		for (int child : adj.get(v)) {
			if (child == par)
				continue;
			depth[child] = depth[v] + 1;
			dfs(child, v, depth, adj);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			int n = sc.nextInt();
			ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
			for (int i = 0; i < n; i++) {
				adj.add(new ArrayList<Integer>());
			}
			for (int j = 0; j < n - 1; j++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				a--;
				b--;
				adj.get(a).add(b);
				adj.get(b).add(a);
			}
			int[] depth = new int[n];
			dfs(0, -1, depth, adj);
			int max_d = -1;
			int max_n = 0;
			for (int i = 0; i < n; i++) {
				if (max_d < depth[i]) {
					max_d = depth[i];
					max_n = i;
				}
				depth[i] = 0;
			}
			dfs(max_n, -1, depth, adj);
			max_d = -1;
			for (int i = 0; i < n; i++) {
				max_d = Math.max(max_d, depth[i]);
			}
			str.append(max_d + "\n");
		}
		System.out.println(str);
		sc.close();
	}
}
