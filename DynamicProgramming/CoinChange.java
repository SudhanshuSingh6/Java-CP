package DynamicProgramming;

import java.util.*;

public class CoinChange {

    static long countWays(int S[], int m, int n) {
        long[] table = new long[n + 1];
        Arrays.fill(table, 0);
        table[0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = S[i]; j <= n; j++) {
                table[j] += table[j - S[i]];
            }
            System.out.println(Arrays.toString(table));
        }
        return table[n];
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,3};
        int m = arr.length;
        int n = 7;
        System.out.println(countWays(arr, m, n));
    }
}
