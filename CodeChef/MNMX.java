package CodeChef;

import java.util.*;

public class MNMX {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            long m = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (m > arr[i]) {
                    m = arr[i];
                }
            }
            System.out.println(m * (long) (n - 1));
        }
    }
}
