package CodeForces;

import java.util.*;

public class LittlePonyAndSortByShift {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 0, b = 0;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (i > 0 && a[i - 1] > a[i]) {
                t++;
                b = i;
            }
        }
        if (t == 0) {
            System.out.println("0");
        } else if (t == 1 && a[n - 1] <= a[0]) {
            System.out.println(n - b);
        } else {
            System.out.println("-1");
        }
    }
}
