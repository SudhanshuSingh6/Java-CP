package CodeChef;

import java.util.*;

public class CHECHOC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int p = 0; p < t; p++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (n * m > 1) {
                x = Math.min(x, y);
            }
            y = Math.min(y, 2 * x);
            int c = (n * m + 1) / 2 * x + (n * m) / 2 * (y - x);
            System.out.println(c);
        }
    }
}
