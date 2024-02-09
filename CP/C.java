package CP;

import java.util.*;

public class C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int xx = 0; xx < t; xx++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			long[] prefix = new long[n + 1];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				prefix[i + 1] = arr[i] + prefix[i];
			}
			int l = 1;
			int h = n;
			while (l <= h) {
				int mid = (l + h) / 2;
				StringBuilder str = new StringBuilder();
				str.append("? " + "" + mid + " ");
				for (int i = 1; i <= mid; i++)
					str.append(i + " ");
				System.out.println(str);
				int a = sc.nextInt();
				if (a > prefix[mid])
					h = mid - 1;
				else
					l = mid + 1;
			}
			System.out.println("!" + " " + l);
		}
		sc.close();
	}
}