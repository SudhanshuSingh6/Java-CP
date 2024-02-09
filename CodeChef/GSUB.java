package CodeChef;

import java.util.*;

public class GSUB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < k; i++) {
                int h = sc.nextInt();
                int m = sc.nextInt();
                arr[h - 1] = m;
                int c = Integer.MIN_VALUE;
                int s = 1;
                for (int j = 1; j < n; j++) {
                    if (arr[j] != arr[j - 1]) {
                        s++;
                    }
                }
                c = Math.max(s, c);
                str.append(c + " " + "\n");
            }
        }
        System.out.println(str);
    }
}
