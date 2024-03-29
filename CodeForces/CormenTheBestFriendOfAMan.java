package CodeForces;

import java.util.*;

public class CormenTheBestFriendOfAMan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int c = 0;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] + arr[i] < k) {
                count += (k - arr[i] - arr[i - 1]);
                arr[i] += (k - arr[i] - arr[i - 1]);
            }
        }
        System.out.println(count);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
