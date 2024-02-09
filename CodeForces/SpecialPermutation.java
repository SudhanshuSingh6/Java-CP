package CodeForces;

import java.util.*;

public class SpecialPermutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            if (n > 2) {
                int[] arr = new int[n];
                int k = 0;
                for (int i = n; i >= 1; i--) {
                    arr[k] = i;
                    k++;
                }
                if (n % 2 != 0) {
                    int temp = arr[n / 2];
                    arr[(n / 2)] = 1;
                    arr[n - 1] = temp;
                }
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                System.out.print(2 + " " + 1);
            }
            System.out.println();
        }
    }
}
