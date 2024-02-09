package CodeChef;

import java.util.*;

public class COVID19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int c = 1;
            int a = 0;
            int b = 0;
            int m = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (Math.abs(arr[j - 1] - arr[j]) <= 2) {
                        c++;
                        m = j;
                    } else {
                        break;
                    }
                }
                if (i == 0) {
                    a = c;
                    b = c;
                }
                if (c > a) {
                    a = c;
                }
                if (c < b) {
                    b = c;
                }
                c = 1;
                if (m == n - 1) {
                    break;
                } else {
                    i = m;
                    m++;
                }

            }
            System.out.println(b + " " + a);
        }
    }
}
