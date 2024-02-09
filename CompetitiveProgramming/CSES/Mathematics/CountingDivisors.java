package CompetitiveProgramming.CSES.Mathematics;

import java.util.*;

public class CountingDivisors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] divisors = new int[1000001];
		for (int i = 1; i < 1000001; i++) {
			for (int j = i; j < 1000001; j += i) {
				divisors[j]++;
			}
		}
		int t = sc.nextInt();
		StringBuilder str = new StringBuilder();
		for (int xx = 0; xx < t; xx++) {
			int n = sc.nextInt();
			str.append(divisors[n] + "\n");
		}
		System.out.println(str);
		sc.close();
	}
}
