package CodeForces;

import java.util.*;

public class SashaAndHisTrip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();
        if (n - 1 <= v) {
            System.out.println(n - 1);
            return;
        }
        int cnt = v - 1;
        for (int i = 1; i <= n - v; i++) {
            cnt += i;
        }
        System.out.println(cnt);
    }
}
