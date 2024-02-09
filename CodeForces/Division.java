package CodeForces;

import java.util.*;

public class Division {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            long p = sc.nextLong();
            long q = sc.nextLong();
            if (p % q != 0) {
                System.out.println(p);
            } else {
                ArrayList<Long> a = new ArrayList<>();
                a.add(q);
                for (long i = 2; i <= Math.sqrt(q); i++) {
                    if (q % i == 0) {
                        a.add(i);
                        if (i != q / i) {
                            a.add(q / i);
                        }
                    }
                }
                long ans = 1;
                for (Long i : a) {
                    long tt = p;
                    while (tt % i == 0) {
                        tt = tt / i;
                        if (tt % q != 0) {
                            ans = Math.max(ans, tt);
                            break;
                        }
                    }
                }
                System.out.println(ans);
            }
        }
    }
}
