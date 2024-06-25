package CP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class D {
	public static long qpow(int x, int n, int MOD) {
		if (n == 0)
			return 1;
		long res = qpow(x, n / 2, MOD);
		return n % 2 == 0 ? res * res % MOD : res * res % MOD * x % MOD;
	}

	static class Pair {
		long x;
		long y;

		public Pair(long x, long y) {
			this.x = x;
			this.y = y;
		}
	}

	static class Triplet {
		long x;
		long y;
		long idx;

		public Triplet(long x, long y, long idx) {
			this.x = x;
			this.y = y;
			this.idx = idx;
		}
	}

	static void make(int[] parent) {
		for (int i = 0; i < parent.length; i++) {
			parent[i] = i;
		}
	}

	static int find(int v, int[] parent) {
		if (v == parent[v])
			return v;
		return parent[v] = find(parent[v], parent);
	}

	static boolean union(int a, int b, int[] parent, int[] freq) {
		a = find(a, parent);
		b = find(b, parent);
		if (a == b)
			return freq[b] % 2 == 0;
		freq[a] += freq[b];
		parent[b] = a;
		return true;
	}

	static boolean strenbs(Pair a[], Pair b) { // x is the target value or key
		boolean ok = false;
		int l = 0, r = a.length - 1;
		while (l <= r) {
			int m = (l + r) / 2;
			if (a[m].x > b.x) {
				r = m - 1;
				if (a[m].y < b.y)
					return true;
			} else
				l = m + 1;
		}
		return false;
	}

	static int dfs(int u, int p, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
		vis[u] = true;
		int c = 0;
		for (int v : adj.get(u)) {
			if (vis[v] == true)
				continue;
			c += 1 + dfs(v, u, adj, vis);
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = 1;
		StringBuilder str = new StringBuilder();
		for (int xx = 0; xx < t; xx++) {
			int n = sc.nextInt();
			char[] a = sc.next().toCharArray();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();
			int cnt = 0;
			int idx = 0;
			for (int i = 0; i < n - 1; i++) {
				if (a[i] == a[i + 1]) {
					cnt++;
					idx = i;
				}
			}
			if (cnt == 0) {
				long ans = Long.MAX_VALUE;
				for (int i = 0; i < n - 1; i++) {
					if (a[i] != a[i + 1])
						ans = Math.min(ans, Math.min(arr[i], arr[i + 1]));
				}
				str.append(ans);
			} else if (cnt == 1) {
				str.append(0);
			} else {
				long ans = Long.MIN_VALUE;
				long an = 0;
				for (int i = 0; i < n - 1; i++) {
					if (a[i] == a[i + 1]) {
						if (arr[i] + arr[i + 1] > arr[idx] + arr[idx + 1]) {
							idx = i;
						}
					}
				}
				a[idx] = '2';
				a[idx + 1] = '3';
				for (int i = 0; i < n - 1; i++) {
					if (a[i] == a[i + 1])
						an += arr[i] + arr[i + 1];
				}
				str.append(an + " " + (arr[idx] + arr[idx]));
			}
		}
		System.out.println(str);
		sc.close();
	}
}
