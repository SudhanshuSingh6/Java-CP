package CodeForces;

import java.util.*;

public class Barrels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr, Collections.reverseOrder());
            long s = arr[0];
            for (int i = 1;i <= k&&i<n;i++) {
                s = s + arr[i];
            }
            System.out.println(s);
        }
    }
}
