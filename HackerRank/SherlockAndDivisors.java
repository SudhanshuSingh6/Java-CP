package HackerRank;

import java.util.*;

public class SherlockAndDivisors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            long n = sc.nextInt();
            int c = 0;
            if (n % 2 == 0) {
                for (long i = 2; i <=(Math.sqrt(n)); i++) {
                    if (n % i == 0) {
                        if (i % 2 == 0) {
                            c++;
                        }
                        if ((n / i) % 2 == 0) {
                            c++;
                        }
                        if (i == n / i) {
                            c--;
                        }
                    }
                }
                System.out.println(c + 1);
            } else {
                System.out.println(0);
            }
        }
    }
}
