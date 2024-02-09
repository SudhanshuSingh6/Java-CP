package HackerRank;

import java.util.*;

public class Candles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int c = 0;
        int[] ar1 = new int[n];
        int k = ar1[0];
        for (int i = 0; i < n; i++) {
            ar1[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (ar1[i] > k) {
                k = ar1[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (ar1[i] == k) {
                c++;
            }
        }
        System.out.println(k);
        System.out.println(c);
    }
}
