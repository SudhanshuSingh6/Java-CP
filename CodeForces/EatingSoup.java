package CodeForces;

import java.util.*;

public class EatingSoup {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (m == 0) {
            System.out.println(1);
        } else {
            System.out.println(Math.min(m, n - m));
        }
    }
}
