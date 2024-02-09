package CodeForces;

import java.util.*;

public class ArrayCancellation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            long a =0;
            long s =0;
            for (int i = 0; i < n; i++) {
                a  += sc.nextInt();
                s=Math.min(s,a);
            }
            System.out.println(-s);
        }
    }
}
