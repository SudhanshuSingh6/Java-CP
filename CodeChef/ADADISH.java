package CodeChef;

import java.util.*;

public class ADADISH {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder str = new StringBuilder();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int s = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int p = 0;
            if (n == 1) {
                str.append(arr[0] + "\n");
            } else if (n == 2) {
                str.append(Math.max(arr[0], arr[1]) + "\n");
            } else if (n == 3) {
                p = arr[0] + arr[2];
                s = arr[0] + arr[1];
                str.append(Math.min(Math.max(p, arr[1]), Math.max(s, arr[2])) + "\n");
            } else {
                int a = Math.max(arr[0] + arr[1] + arr[2], arr[3]);
                int b = Math.max(arr[1] + arr[2], arr[3] + arr[0]);
                int c = Math.max(arr[2] + arr[3], arr[0] + arr[1]);
                int d = Math.max(arr[0] + arr[1] + arr[2], arr[3]);
                str.append(Math.min(Math.min(a, b), Math.min(c, d)) + "\n");
            }
        }
        System.out.println(str);
    }
}
