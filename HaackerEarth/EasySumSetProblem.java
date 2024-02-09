package HaackerEarth;

import java.util.*;

class EasySumSetProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			int num = sc.nextInt();
			list.add(num);
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= 100; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (list.contains(i + arr[j]))
					count++;
			}
			if (count == n)
				sb.append(i + " ");
		}
		System.out.println(sb);
		sc.close();
	}
}