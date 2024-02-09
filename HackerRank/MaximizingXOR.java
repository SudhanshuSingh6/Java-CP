package HackerRank;

import java.util.*;

public class MaximizingXOR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = 0;
        int l = 0;
        int k = 0;
        for (int i = n; i <= m; i++) {
            c = n ^ i;
            k = m ^ i;
            l = Math.max(l, Math.max(k, c));
        }
        System.out.println(l);
    }
}
