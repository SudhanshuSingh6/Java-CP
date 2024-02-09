package CodeChef;

import java.util.*;

public class SUBMEXS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            long p = 0;
            int k = 0;
            for (int i = 0; i < n - 1; i++) {
                int a = sc.nextInt();
                p = p + a;
                if (i == (n - 2)) {
                    k = a;
                }
            }
            System.out.println(p + k + 1);
        }
    }
}
