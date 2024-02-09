package CodeChef;

import java.util.*;

public class CNOTE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int o = 0; o < t; o++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            int n = sc.nextInt();
            x = x - y;
            int m = 0;
            int l = x;
            for (int i = 0; i < n; i++) {
                int p = sc.nextInt();
                int c = sc.nextInt();
                if(m==1)
                    continue;
                if (p >= x) {
                    if (c <= k) {
                        x = x - p;
                    }
                }
                if (x <= 0) {
                    System.out.println("LuckyChef");
                    m = 1;
                }
                x = l;
            }
            if (m != 1) {
                System.out.println("UnluckyChef");
            }
        }
    }
}
