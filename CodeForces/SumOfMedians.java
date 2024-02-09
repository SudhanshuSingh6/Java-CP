package CodeForces;

import java.util.*;

public class SumOfMedians {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n * k + 1];
            arr[0] = 0;
            for (int i = 1; i <= n * k; i++) {
                arr[i] = sc.nextInt();
            }
            long s = 0;
            int c = 0;
            if (n % 2 != 0) {
                int g = (int) Math.floor(((n * 1.0) / 2));
                for (int i = (n * k) - g; i >= 1; i = i - (n - g)) {
                    if (c < k) {
                        c++;
                        s = s + arr[i];
                    }
                }
            } else {
                {
                    int g = (int) Math.floor(((n * 1.0) / 2));
                    for (int i = (n * k) - g; i >= 1; i = i - 1 - (n - g)) {
                        if (c < k) {
                            c++;
                            s = s + arr[i];
                        }
                    }

                }
            }
            str.append(s + " " + "\n");
        }
        System.out.println(str);
    }
}
