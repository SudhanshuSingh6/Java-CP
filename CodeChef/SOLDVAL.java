package CodeChef;

import java.util.Scanner;

public class SOLDVAL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int p1[] = new int[n];
            p1[0] = arr[0];
            for (int i = 1; i < n; i++) {
                p1[i] = Math.min(p1[i - 1] + 1, arr[i]);
            }
            int p2[] = new int[n];
            p2[n - 1] = arr[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                p2[i] = Math.min(p2[i + 1] + 1, arr[i]);
            }
            for (int i = 0; i < n; i++) {
                str.append(Math.min(p1[i], p2[i]) + " ");
            }
            str.append("\n");
        }
        System.out.println(str);
    }
}
