package CodeChef;

import java.util.*;

public class CHEFEZQ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] arr = new long[n];
            long m = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                m = m + arr[i];
                arr[i] = m;
            }
            long p = 0;
            for (int i = 0; i < n; i++) {
                p = (arr[i] / k);
                if (p < (i + 1)) {
                    break;
                }
            }
            System.out.println(p + 1);
        }
    }
}
