package Recursion;

import java.util.*;

public class Prime {

    static int prime(int n, int i) {
        if (i == 1) {
            return 1;
        }
        if (n % i == 0) {
            return 0;
        } else {
            return prime(n, i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(prime(n, n - 1));
    }
}
