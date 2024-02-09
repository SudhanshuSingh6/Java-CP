package CodeChef;

import java.util.*;

public class MAXDIFF {

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
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + arr[i];
            }
            long s = 0;
            long s1 = 0;
            Arrays.sort(arr);
            for (int i = 0; i < k; i++) {
                s = s + arr[i];
            }
            for (int i = n - k; i < n; i++) {
                s1 = s1 + arr[i];
            }
            System.out.println(Math.max((Math.abs(s1 - (sum - s1))), (Math.abs(s - (sum - s)))));
        }
    }

}
