package CodeForces;

import java.util.*;

public class Godsend {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        long s = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            s = s + arr[i];
            arr[i] = s;
        }
        if (s % 2 != 0) {
            System.out.println("First");
        } else {
            int a = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 != 0) {
                    a++;
                }
            }
            if (a == 0) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        }
    }
}
