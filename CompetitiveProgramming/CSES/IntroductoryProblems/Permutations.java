package CompetitiveProgramming.CSES.IntroductoryProblems;

import java.util.*;

public class Permutations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder str = new StringBuilder();
		if (n == 3 || n == 2) {
			str.append("NO SOLUTION");
		} else {
			for (int i = 2; i <= n; i = i + 2) {
				str.append(i + " ");
			}
			for (int i = 1; i <= n; i = i + 2) {
				str.append(i + " ");
			}

		}
		System.out.println(str);
		sc.close();
	}
}
