package CP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//C. Minimize Distance
public class B {
	static class Pair {
		int x;
		int y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static class Triplet {
		int x;
		int y;
		int z;

		public Triplet(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}

	static int gcd(int n, int m) {
		if (m == 0)
			return n;
		return gcd(m, n % m);
	}

	static boolean ispalin(int[] s, int p) {
		int n = s.length;
		int i = 0;
		int j = n - 1;
		while (i < j) {
			if (s[i] == p) {
				i++;
				continue;
			}
			if (s[j] == p) {
				j--;
				continue;
			}
			if (s[i] != s[j])
				return false;
			i++;
			j--;
		}
		return true;
	}

	static void dfs(ArrayList<ArrayList<Integer>> adj, int c, int n, int s, int[] cnt, int[] ans) {
		int idx = 0;
		int id = 0;
		for (int i = 0; i < n; i++) {
			if (ans[i] > 0)
				continue;
			if (cnt[id] < cnt[i]) {
				id = i;
			}
		}
		for (int i : adj.get(id)) {
			if (adj.get(adj.get(i).get(0)).get(0) == i) {
				if (!adj.get(adj.get(i).get(1)).contains(i)) {
					idx = adj.get(i).get(1);
					break;
				}
			} else if (!adj.get(adj.get(i).get(0)).contains(i)) {
				idx = adj.get(i).get(0);
				break;
			}
		}
		ans[id] = c;
		for (int i : adj.get(id)) {
			if (i != idx)
				ans[i] = c;
		}
		System.out.println(idx + " " + id);
		if (idx != id)
			dfs(adj, c + 1, n, idx, cnt, ans);
	}

	static int CeilIndex(int A[], int l, int r, int key) {
		while (r - l > 1) {
			int m = l + (r - l) / 2;
			if (A[m] >= key)
				r = m;
			else
				l = m;
		}

		return r;
	}

	static int LongestIncreasingSubsequenceLength(int A[], int size) {
		// Add boundary case, when array size is one

		int[] tailTable = new int[size];
		int len; // always points empty slot

		tailTable[0] = A[0];
		len = 1;
		for (int i = 1; i < size; i++) {
			if (A[i] < tailTable[0])
				// new smallest value
				tailTable[0] = A[i];

			else if (A[i] + 1 == tailTable[len - 1])
				// A[i] wants to extend largest subsequence
				tailTable[len++] = A[i];

			else
				// A[i] wants to be current end candidate of an existing
				// subsequence. It will replace ceil value in tailTable
				tailTable[CeilIndex(tailTable, -1, len - 1, A[i])] = A[i];
		}

		return len;
	}

	static long gg(long n) {
		if (n == 1)
			return 1;
		if (n % 2 == 0)
			return (2 * gg(n / 2) + 1);
		else
			return (2 * gg(n + 1) / 2);
	}

	static long ff(long n) {
		if (n == 1)
			return 0;
		if (n % 2 == 0)
			return ff(n / 2) + 1;
		else
			return ff((n + 1) / 2);
	}

	static long calcpow(long a, long b) {
		if (b == 0)
			return 1;
		long temp = calcpow(a, b / 2);
		temp = ((temp % MOD) * (temp % MOD)) % MOD;
		if (b % 2 == 1)
			return ((temp % MOD) * (a % MOD)) % MOD;
		return temp;
	}

	static long inv(long a, int m) {
		return calcpow(a, m - 2);
	}

	static int min(int startIndex, int arr[]) {
		int min = startIndex;

		for (int i = startIndex + 1; i < arr.length; i++) {
			if (arr[i] < arr[min])
				min = i;
		}

		return min;
	}

	static public int minEatingSpeed(int[] piles, int h) {
		int low = 1;
		int high = (int) 1e9;
		while (low <= high) {
			int mid = low + high >> 1;
			int time = 0;
			for (int i = 0; i < piles.length; i++) {
				time += (piles[i] + (mid - 1)) / mid;
			}
			if (time >= h)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return low;
	}

	static int calc(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n = n / 10;
		}
		return sum;
	}

	static int func(int[][] count, int n, int[] tot, int i) {
		int[] ans = new int[n];
		for (int j = 0; j < n; j++)
			ans[j] = count[j][i] - (tot[j] - count[j][i]);
		Arrays.sort(ans);
		int c = 0;
		int j = n - 1;
		int k = 0;
		while (j >= 0) {
			if (c + ans[j] > 0)
				c += ans[j];
			else
				break;
			j--;
			k++;
		}
		return k;
	}

	static int MOD = 998244353;

	static boolean check(ArrayList<Integer> a, int n, int k) {
		for (int i = n - 1; i >= 0; i--) {
			if (k >= a.get(i))
				k -= a.get(i);
		}
		if (k != 0)
			return false;
		else
			return true;
	}

	static void dfs(int i, int j, int n, int m) {
		if (!check(i, j, n, m))
			return;
		k += ar[i][j];
		ar[i][j] = 0;
		dfs(i + 1, j, n, m);
		dfs(i - 1, j, n, m);
		dfs(i, j + 1, n, m);
		dfs(i, j - 1, n, m);
		return;
	}

	static boolean check(int i, int j, int n, int m) {
		if (i >= 0 && i < n && j >= 0 && j < m && ar[i][j] != 0)
			return true;
		return false;
	}

	static int ar[][];
	static long k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		int t = sc.nextInt();
		for (int xx = 0; xx < t; xx++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			char[][] adj = new char[n + 1][m + 1];
			int[][] ad = new int[n + 2][m + 2];
			Queue<Triplet> q = new LinkedList<>();
			for (int i = 1; i <= n; i++) {
				Arrays.fill(ad[i], Integer.MAX_VALUE);
				String s = sc.next();
				for (int j = 0; j < m; j++) {
					if (s.charAt(j) == '0')
						q.add(new Triplet(i, j + 1, 0));
					adj[i][j + 1] = s.charAt(j);
				}
			}

			int[][] a = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };
			int ans = Integer.MIN_VALUE;
			int c = 0;
			while (!q.isEmpty()) {
				c++;
				Triplet u = q.peek();
				Triplet p = q.poll();
				for (int[] b : a) {
					c++;
					p.x += b[0];
					p.y += b[1];
					if (p.x == 0 || p.x > n) {
						ad[p.x][p.y] = Math.min(ad[p.x][p.y], p.z);
					} else if (p.y == 0 || p.y > m) {
						ad[p.x][p.y] = Math.min(ad[p.x][p.y], p.z);
					} else {
						if (adj[p.x][p.y] != '0' && adj[p.x][p.y] != '2') {
							ad[u.x][u.y] = Math.min(ad[u.x][u.y], p.z + 1);
							q.add(new Triplet(p.x, p.y, p.z + 1));
							adj[p.x][p.y] = '2';
							System.out.println(p.x + " " + p.y + " " + p.z);
						}
					}
				}
			}
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					System.out.print(adj[i][j] + " ");
				}
				System.out.println();
			}

			for (int i = 1; i <= n; i++)
				System.out.println(Arrays.toString(ad[i]));
			for (int i = 0; i <= n; i++) {
				ans = Math.min(ans, ad[i][0]);
			}
			for (int i = 0; i <= n; i++) {
				ans = Math.min(ans, ad[i][n - 1]);
			}
			for (int i = 0; i <= m; i++) {
				ans = Math.min(ans, ad[0][i]);
			}
			for (int i = 0; i <= n; i++) {
				ans = Math.min(ans, ad[m - 1][i]);
			}
			str.append(ans + "\n");
		}
		System.out.println(str);
		sc.close();
	}
}