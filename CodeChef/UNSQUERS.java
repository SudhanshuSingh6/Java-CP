package CodeChef;

import java.util.*;

public class UNSQUERS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] ar = new int[10000][1000];
        StringBuilder str = new StringBuilder();
        int n = sc.nextInt();
        int q = sc.nextInt();
        int s = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[][] dp1 = new int[n][n];
        int c = 1;
        int p = 1;
        for (int i = 0; i < n; i++) {
            int m = arr[i];
            for (int l = i + 1; l < n; l++) {
                if (arr[l] > m) {
                    m = arr[l];
                    c++;
                }
                dp1[i][l] = c;
            }
            c = 1;
        }
        for (int i = 0; i < n; i++) {
            int m = arr[i];
            for (int l = 0; l < n; l++) {
                System.out.print(dp1[i][l]+" ");
            }
            System.out.println();
        }
        int[] dpi = new int[q];
        int[] dpj = new int[q];
        int[] dp = new int[n];
        int e = 0;
        int d = 0;
        for (int o = 0; o < q; o++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (s == 1) {
                a = ((a + (e - 1)) % n) + 1;
                b = ((b + (e - 1)) % n) + 1;
            }

        }
        System.out.println(str);
    }
}
10 10 0
7 8 8 9 10 10 2 3 5 10
1 4
1 5
1 7
2 8
3 7
4 10
4 9
5 8
5 10
5 9
3
4
4
3
3
4
3
2
4
3
