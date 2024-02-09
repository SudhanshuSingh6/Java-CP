package CodeForces;

import java.util.*;

public class ValeraAndPlates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int c = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a == 1) {
                m--;
            }
            if (a == 2) {
                if (k <= 0) {
                    m--;
                }
                k--;
            }
            if (m == -1) {
                m++;
                c++;
            }
        }
        System.out.println(c);

    }
}
