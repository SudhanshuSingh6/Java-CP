package CodeForces;

import java.util.*;

public class BarkToUnlock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        int c = 0;
        String x = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                x = arr[i] + arr[j];
                if (x.contains(s)) {
                    c = 1;
                    break;
                }
            }
        }
        if (c == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
