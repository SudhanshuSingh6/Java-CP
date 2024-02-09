package CodeForces;

import java.util.*;

public class IlyaAndQueries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder s = new StringBuilder();
        int[] dp = new int[str.length()];
        for (int i = 1; i < str.length(); i++) {
            dp[i] = (str.charAt(i) == str.charAt(i - 1)) ? dp[i - 1] + 1 : dp[i - 1];
        }
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            s.append(dp[b - 1] - dp[a - 1] + "\n");
        }
        System.out.println(s);
    }
}
