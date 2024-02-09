package CompetitiveProgramming.CSES.Mathematics;

import java.util.*;

public class CommonDivisors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] cnt = new int[1000001];
		for (int i = 0; i < n; i++)
			cnt[sc.nextInt()]++;
		int ans = 1;
		for (int i = 1000000; i >= 1; i--) {
			int d = 0;
			for (int j = i; j < 1000001; j += i)
				d += cnt[j];
			if (d >= 2) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
