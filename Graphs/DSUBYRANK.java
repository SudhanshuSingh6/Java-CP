package Graphs;

import java.util.*;

public class DSUBYRANK {
	static void make(int v, int[] size, int[] arr) {
		arr[v] = v;
		size[v] = 1;
	}

	static int find(int v, int[] arr) {
		if (v == arr[v])
			return v;
		return arr[v] = find(arr[v], arr);
	}

	static void union(int a, int b, int[] size, int[] arr) {
		a = find(a, arr);
		b = find(b, arr);
		if (a != b) {
			if (size[a] < size[b]) {
				int temp = size[a];
				size[a] = size[b];
				size[b] = temp;
			}
			arr[b] = a;
			size[a] += size[b];
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		int t = sc.nextInt();
		for (int xx = 0; xx < t; xx++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] arr = new int[n];
			int[] size = new int[n];
			for (int i = 0; i < n; i++) {
				make(i, size, arr);
			}
			for (int i = 0; i < m; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				union(a, b, size, arr);
			}
			int q = sc.nextInt();
			for (int i = 0; i < q; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				if (find(a, arr) == find(b, arr))
					str.append("YO" + "\n");
				else
					str.append("NO" + "\n");
			}
		}
		System.out.println(str);
	}
}
