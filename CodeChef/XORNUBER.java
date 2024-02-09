package CodeChef;

import java.util.*;

public class XORNUBER {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder output = new StringBuilder();
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			int n = sc.nextInt();
			if (n % 2 != 0) {
				if (n == 1)
					output.append("2");
				else if (n == 3)
					output.append("1");
				else if ((n & (n + 1)) == 0) {
					String s = Integer.toString(n, 2);
					int ans = (int) (Math.pow(2, s.length() - 1));
					output.append(ans - 1);
				} else
					output.append("-1");
			} else
				output.append("-1");

			output.append("\n");
		}
		System.out.println(output);
	}
}
