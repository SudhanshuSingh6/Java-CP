package CodeChef;

import java.util.*;

public class STUPMACH {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            long a = 0;
            int p = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int k = sc.nextInt();
                p = Math.min(p, k);
                a = a + p;
            }
            System.out.println(a);
        }
    }
}
