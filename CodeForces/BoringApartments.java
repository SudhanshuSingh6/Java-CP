package CodeForces;

import java.util.*;

public class BoringApartments {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            String s = String.valueOf(n);
            long c = 0;
            for (int i = 1; i < Integer.valueOf(s.charAt(0) - '0'); i++) {
                c = c + 10;
            }
            if (s.length() == 4) {
                c = c + 10;
            } else if (s.length() == 3) {
                c = c + 6;
            } else if (s.length() == 2) {
                c = c + 3;
            } else {
                c++;
            }
            System.out.println(c);
        }
    }
}
