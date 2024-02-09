package CodeChef;

import java.util.*;

public class DPAIRS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        int n = sc.nextInt();
        int m = sc.nextInt();
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        int max1 = -1;
        int min2 = -1;
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                max1 = i;
            }
        }
        long[] arr2 = new long[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
            if (arr2[i] < min) {
                min = arr2[i];
                min2 = i;
            }
        }
        for (int i = 0; i < m; i++) {
            str.append(max1 + " " + i + "\n");
        }
        for (int i = 0; i < n; i++) {
            if (i != max1) {
                str.append(i + " " + min2 + "\n");
            }
        }
        System.out.println(str);
    }
}
