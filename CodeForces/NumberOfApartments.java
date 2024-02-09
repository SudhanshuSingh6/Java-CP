package CodeForces;

import java.util.*;

public class NumberOfApartments {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            if (n == 1 || n == 4 || n == 2) {
                System.out.println(-1);
            } else {
                if (n % 3 == 0) {
                    System.out.println(n / 3 + " " + 0 + " " + 0);
                } else if (n % 3 == 1) {
                    System.out.println((n - 7) / 3 + " " + 0 + " " + 1);
                } else {
                    System.out.println((n - 5) / 3 + " " + 1 + " " + 0);
                }
            }
        }
    }
}
