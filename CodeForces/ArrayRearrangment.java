package CodeForces;

import java.util.*;

public class ArrayRearrangment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            Integer[] arr = new Integer[n];
            Integer[] ar = new Integer[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                ar[i] = sc.nextInt();
            }
            Arrays.sort(ar);
            int c = 0;
            Arrays.sort(arr, Collections.reverseOrder());
            for (int i = 0; i < n; i++) {
                if (arr[i] + ar[i] > k) {
                    c = 1;
                    break;
                }
            }
            if (c == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
