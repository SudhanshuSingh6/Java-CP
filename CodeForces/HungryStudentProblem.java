package CodeForces;

import java.util.*;

public class HungryStudentProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int k = 0;
            for (int x = 0; x <= 33; x++) {
                for (int j = 0; j <= 33; j++) {
                    if ((7 * x) + (3 * j) == m) {
                        k = 1;
                        break;
                    }
                }
            }
            if (k == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
