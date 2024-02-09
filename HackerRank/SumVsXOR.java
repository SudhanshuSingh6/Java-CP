package HackerRank;

import java.util.*;

public class SumVsXOR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long c = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                c = c + 1;
            }
            n /= 2;
        }
        c = (long) Math.pow(2, c);
        System.out.println(c);
    }
}
