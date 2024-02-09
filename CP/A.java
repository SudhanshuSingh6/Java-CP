package CP;

/*
⠀⠀⠀⠀⣠⣶⡾⠏⠉⠙⠳⢦⡀⠀⠀⠀⢠⠞⠉⠙⠲⡀⠀
⠀⠀⠀⣴⠿⠏⠀⠀⠀⠀⠀⠀⢳⡀⠀ ⡏ ⠀B⠀  ⢷
⠀⠀⢠⣟⣋⡀⢀⣀⣀⡀⠀⣀⡀⣧⠀⢸⠀⠀L⠀⠀⡇
⠀⠀⢸⣯⡭⠁⠸⣛⣟⠆⡴⣻⡲⣿⠀⣸⠀⠀A⠀  ⡇
⠀⠀⣟⣿⡭⠀⠀⠀⠀⠀⢱⠀⠀⣿⠀⢹⠀⠀D⠀⠀⡇
⠀⠀⠙⢿⣯⠄⠀⠀⠀⢀⡀⠀⠀⡿⠀⠀⡇⠀E⠀ ⡼
⠀⠀⠀⠀⠹⣶⠆⠀⠀⠀⠀⠀⡴⠃⠀⠀⠘⠤⣄⣠⠞⠀
⠀⠀⠀⠀⠀⢸⣷⡦⢤⡤⢤⣞⣁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⢀⣤⣴⣿⣏⠁⠀⠀⠸⣏⢯⣷⣖⣦⡀⠀⠀⠀⠀⠀⠀
⢀⣾⣽⣿⣿⣿⣿⠛⢲⣶⣾⢉⡷⣿⣿⠵⣿⠀⠀⠀⠀⠀⠀
⣼⣿⠍⠉⣿⡭⠉⠙⢺⣇⣼⡏⠀⠀⠀⣄⢸⠀⠀⠀⠀⠀⠀
⣿⣿⣧⣀⣿………⣀⣰⣏⣘⣆⣀⠀⠀
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class A {
	static class Pair {
		int x;
		int y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
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

	static int lbs(long a[], int high) { // x is the target value or key
		int l = 0, r = high;
		while (l <= r) {
			int m = (l + r) / 2;
			if (a[m] < m)
				l = m + 1;
			else
				r = m - 1;
		}
		return r + 1;
	}

	static int ubs(long a[], int high) {// x is the key or target value
		int l = 0, r = high;
		while (l <= r) {
			int m = (l + r) / 2;
			if (a[m] > m)
				r = m - 1;
			else
				l = m + 1;
		}
		return r + 1;
	}

	static boolean ok(int n, int m) {
		if (n == m)
			return true;
		else if (n % 3 != 0)
			return false;
		return (ok(n / 3, m) || ok(2 * n / 3, m));
	}

//1 1 1 2 2 2
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		int tt = sc.nextInt();
		for (int xx = 0; xx < tt; xx++) {
			int[] idx = new int[10];
			ArrayList<ArrayList<Integer>> map = new ArrayList<>();
			char[] data = sc.next().toCharArray();
			int m = sc.nextInt();
			String l = sc.next();
			String r = sc.next();
			for (int i = 0; i < 10; i++)
				map.add(new ArrayList<>());
			for (int i = 0; i < data.length; i++) {
				map.get(data[i] - '0').add(i);
			}
			int c = 0;
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < 10; j++) {
					while (idx[j] < map.get(j).size() && map.get(j).get(idx[j]) < c) {
						idx[j]++;
					}
				}
				int p = c;
				for (int j = l.charAt(i) - '0'; j <= r.charAt(i) - '0'; j++) {
					if (idx[j] >= map.get(j).size()) {
						p = data.length;
					} else {
						p = Math.max(p, map.get(j).get(idx[j]));
					}
				}
				c = p + 1;
			}
			if (c - 1 >= data.length)
				str.append("YES" + "\n");
			else
				str.append("NO" + "\n");
		}
		System.out.println(str);
		sc.close();
	}
}