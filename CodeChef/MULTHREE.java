package CodeChef;

import java.util.*;

public class MULTHREE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            long k = sc.nextLong();
            int a = sc.nextInt();
            int c = sc.nextInt();
            long d = (a * 10) + c;
            long s = a + c;
            if (s % 3 == 0 || d % 3 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
