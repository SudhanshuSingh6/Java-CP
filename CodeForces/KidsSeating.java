package CodeForces;

import java.util.*;

public class KidsSeating {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int k = (4 * n) - 2;
            for (int i = 0; i < n; i++) {
                System.out.print(k + " ");
                k = k - 2;
            }
            System.out.println();
        }
    }
}
