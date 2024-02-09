package CodeChef;

import java.util.*;

public class CHEFINSQ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        for (int x = 0; x < y; x++) {
            int n = sc.nextInt();
            int s = 0;
            int[] arr = new int[n];
            int k = sc.nextInt();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i < k; i++) {
                s = s + arr[i];
            }

            int d = 0;
            for (int i = 0; i < n - 1; i++) {
                int l = arr[i];
                for (int j = i; j < n - (k - 1); j++) {
                    for (int u = j + 1; u <= j + k - 1; u++) {
                        l = l + arr[u];
                    }
                    if (l == s) {
                        d++;
                    }
                    l = arr[i];
                }
            }
            System.out.println(d);
        }
    }
}try
