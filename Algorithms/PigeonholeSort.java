package Algorithms;

import java.util.*;

public class PigeonholeSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int range = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        range = max - min + 1;
        int[] ar = new int[range];
        for (int i = 0; i < range&&i<n; i++) {
            ar[arr[i] - min]++;
        }
        int t = 0;
        for (int i = 0; i < range; i++) {
            while (ar[i]-- > 0) {
                arr[t++] = i + min;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
