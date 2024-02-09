package CodeForces;

import java.util.*;

public class ToyBlocks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            long n = sc.nextInt();
            long s = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                s = s + a;
            }
            System.out.println(s - (n * (n + 1)) / 2);
        }
    }
}
