package CodeForces;

import java.util.*;

public class PhoenixAndBeauty {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int xx = 0; xx < t; xx++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			TreeSet<Integer> ar = new TreeSet<Integer>();
			for (int i = 0; i < n; i++)
				ar.add(sc.nextInt());
			if (ar.size() <= m) {
				System.out.println(n * m);
				for (int i = 1; i <= n; i++) {

					for (int j : ar) {
						System.out.print(j + " ");
					}
					for(int j=0;j<m-ar.size();j++)
						System.out.print(1+" ");

				}
				System.out.println();
			} else
				System.out.println(-1);
		}
	}
}