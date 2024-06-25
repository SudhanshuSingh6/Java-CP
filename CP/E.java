package CP;

/*
⠀⠀⠀⠀⣠⣶⡾⠏⠉⠙⠳⢦⡀⠀⠀⠀⢠⠞⠉⠙⠲⡀⠀
⠀⠀⠀⣴⠿⠏⠀⠀⠀⠀⠀⠀⢳⡀⠀ ⡏ ⠀ S⠀  ⢷
⠀⠀⢠⣟⣋⡀⢀⣀⣀⡀⠀⣀⡀⣧⠀⢸⠀   I⠀⠀⡇
⠀⠀⢸⣯⡭⠁⠸⣛⣟⠆⡴⣻⡲⣿⠀⣸⠀⠀ N⠀  ⡇
⠀⠀⣟⣿⡭⠀⠀⠀⠀⠀⢱⠀⠀⣿⠀⢹⠀⠀ G⠀  ⡇
⠀⠀⠙⢿⣯⠄⠀⠀⠀⢀⡀⠀⠀⡿⠀⠀⡇⠀ H⠀ ⡼
⠀⠀⠀⠀⠹⣶⠆⠀⠀⠀⠀⠀⡴⠃⠀⠀⠘⠤⣄⣠⠞⠀
⠀⠀⠀⠀⠀⢸⣷⡦⢤⡤⢤⣞⣁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⢀⣤⣴⣿⣏⠁⠀⠀⠸⣏⢯⣷⣖⣦⡀⠀⠀⠀⠀⠀⠀
⢀⣾⣽⣿⣿⣿⣿⠛⢲⣶⣾⢉⡷⣿⣿⠵⣿⠀⠀⠀⠀⠀⠀
⣼⣿⠍⠉⣿⡭⠉⠙⢺⣇⣼⡏⠀⠀⠀⣄⢸⠀⠀⠀⠀⠀⠀
⣿⣿⣧⣀⣿………⣀⣰⣏⣘⣆⣀⠀⠀
 */
import java.io.*;
import java.util.*;

class E {
	static class Pair {
		int index;
		char character;

		Pair(int index, char character) {
			this.index = index;
			this.character = character;
		}
	}

	static class Triplet {
		long x;
		long y;
		long z;

		public Triplet(long x, long y, long z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}

	static long gcd(long n, long m) {
		if (m == 0)
			return n;
		else
			return gcd(m, n % m);
	}

	static long lcm(long n, long m) {
		return (n * m) / gcd(n, m);
	}

	public static long solve(long a, long b, long x, long y, long n) {
		if (a - n >= x) {
			return ((a - n) * b);
		} else {
			n -= a - x;
			a = x;
			if (b - n >= y) {
				return (a * (b - n));
			} else {
				b = y;
				return (a * b);
			}
		}
	}

	static int high(int n) {
		int p = (int) (Math.log(n) / Math.log(2));
		return (int) Math.pow(2, p);
	}

	static boolean prime(int n) {
		int m = (int) Math.sqrt(n);
		for (int i = 2; i <= m; i++)
			if (n % i == 0)
				return false;
		return true;
	}

	static int lbs(long[] arr, long x) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = (l + r) / 2;
			if (arr[m] < x)
				l = m + 1;
			else
				r = m - 1;
		}
		return l;
	}

	static int ubs(long[] arr, long x) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = (l + r) / 2;
			if (arr[m] <= x)
				l = m + 1;
			else
				r = m - 1;
		}
		return l;
	}

	static boolean ok(int n, int m) {
		if (n == m)
			return true;
		else if (n % 3 != 0)
			return false;
		return (ok(n / 3, m) || ok(2 * n / 3, m));
	}

	static void dfs(int x, int y, char[][] arr, boolean[][] vis) {
		if (x >= arr.length || y >= arr[x].length)
			return;
		for (; y < arr[x].length; y++) {
			if (arr[x][y] == '#') {
				vis[x][y] = true;
			} else
				break;
		}
		dfs(x + 1, y - 1, arr, vis);
	}

	static int MOD = 998244353;

//1 1 1 2 2 2
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		int xx = sc.nextInt();
		for (int t = 0; t < xx; t++) {
			int n = sc.nextInt();
			String s = sc.next();
			// System.out.println(s);
			if (n <= 2) {
				if (s.charAt(0) == '0')
					str.append(s.charAt(1) + "\n");
				else
					str.append(s + "" + "\n");

			} else if (n >= 4 && s.contains("0")) {
				str.append(0 + "\n");
			} else {
				long ans = Integer.MAX_VALUE;
				for (int i = 0; i < n - 1; i++) {
					int temp = 0;
					for (int j = 0; j < n; j++) {
						if (j == i) {
							int p = s.charAt(i) - '0';
							int q = s.charAt(i + 1) - '0';
							int g = ((p * 10) + q);
							//System.out.println(p + " " + q + " " + g);
							if (temp == 0)
								temp = g;
							else {
								if (temp == 1)
									temp *= g;
								else if (g == 1)
									temp *= g;
								else
									temp += g;
							}
							j = j + 1;
							continue;
						}
						int k = s.charAt(j) - '0';
						if (temp == 0)
							temp = k;
						else if (k == 1) {
							temp = temp * 1;
						} else
							temp += k;
						//System.out.println(temp);
					}
					ans = Math.min(temp, ans);
				}
				str.append(ans + "\n");
			}
		}
		System.out.print(str);
		sc.close();
	}
}