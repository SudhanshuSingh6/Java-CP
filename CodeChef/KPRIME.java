package CodeChef;

import java.util.*;

public class KPRIME {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 100001;
        int[][] dp = new int[6][s];
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = 0;
        }
        arr[0] = -1;
        arr[1] = -1;
        for (int i = 2; i < s; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
                for (int j = i * 2; j < s; j = j + i) {
                    arr[j]++;
                }
            }
        }
        for (int i = 2; i < s; i++) {
            if (arr[i] < 6) {
                dp[arr[i]][i]++;
            }
        }
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < s; j++) {
                dp[i][j] = dp[i][j - 1] + (arr[j] == i ? 1 : 0);
            }
        }
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
            System.out.println((dp[k][b]-dp[k][a - 1]));
        }
    }
}
