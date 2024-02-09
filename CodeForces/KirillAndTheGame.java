package CodeForces;

import java.util.*;

public class KirillAndTheGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextInt();
        double r = sc.nextInt();
        double x = sc.nextInt();
        double y = sc.nextInt();
        double k = sc.nextDouble();
        int c = 0;
        for (double i = l; i <= r; i++) {
            if ((k / ((i - l) + 1)) - 1 >= x && (k / ((i - l) + 1)) - 1 <= y) {
                c = 1;
                break;
            }
        }
        if (c == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
