package CodeForces;

import java.util.*;

public class Holidays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n % 7;
        if (k > 5) {
            System.out.print((n / 7) * 2 + (k - 5) + " ");
        } else if (k <= 5) {
            System.out.print((n / 7) * 2 + " ");
        }
        if (k == 1) {
            System.out.print((n / 7) * 2 + 1);
        } else if (k > 1) {
            System.out.print((n / 7 * 2) + 2);
        } else {
            System.out.print((n / 7 * 2));
        }
    }
}
