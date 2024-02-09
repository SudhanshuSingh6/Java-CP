package CodeForces;

import java.util.*;

public class YetAnotherBookshelf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int k = 0;
            int a = 0;
            int b = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 1 && a == 0) {
                    a = 1;
                    k = i;
                }
                if (arr[i] == 1) {
                    b = i;
                }
            }
            int c = 0;
            for (int i = k; i <= b; i++) {
                if (arr[i] == 0) {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
