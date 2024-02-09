package CodeForces;

import java.util.*;

public class MakeProductEqualOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long c = 0;
        int p = 0;
        int o = 0;
        for (int i = 0; i < n; i++) {
            int k = (sc.nextInt());
            if (k == 0) {
                c++;
                p++;
            }
            if (k > 0) {
                c += k - 1;
            }
            if (k < 0) {
                c += -1 - k;
                o++;
            }
        }
        if (o % 2 != 0 && p == 0) {
            c = c + 2;
        }
        System.out.println(c);
    }
}
