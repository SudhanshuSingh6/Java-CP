package CodeForces;

import java.util.*;

public class Discounts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sr = new StringBuilder();
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        long k = Arrays.stream(arr).mapToLong(i -> i).sum();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            sr.append(k - arr[sc.nextInt() - 1]+"\n");
        }
        System.out.println(sr);
    }
}
