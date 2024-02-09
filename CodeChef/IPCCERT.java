package CodeChef;

import java.util.*;

public class IPCCERT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        long c = 0;
        for (int i = 0; i < n; i++) {
            long s = 0;
            for (int j = 0; j < k; j++) {
                int a = sc.nextInt();
                s = s + a;
            }
            int q = sc.nextInt();
            if (s >= m && q <= 10) {
                c++;
            }
        }
        System.out.println(c);
    }
}
