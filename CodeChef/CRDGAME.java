package CodeChef;

import java.util.*;

public class CRDGAME {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = n / 9;
            int s = m / 9;
            if (n - (k * 9) >= 1) {
                k++;
            }
            if (m - (s * 9) >= 1) {
                s++;
            }
            if (s == k) {
                System.out.println(1 + " " + s);
            } else if (s > k) {
                System.out.println(0 + " " + k);
            } else {
                System.out.println(1 + " " + s);
            }
        }
    }
}
