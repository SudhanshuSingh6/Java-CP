package DynamicProgramming;

import java.util.*;

public class TilingProblem {

    static int re(int n) {
        if (n <= 1) {
            return n;
        } else {
            return re(n - 1) + re(n - 2);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(re(n));
    }
}
