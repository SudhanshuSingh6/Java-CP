package CodeChef;

import java.util.*;

public class PIPSQUIK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            int c = 0;
            int l = sc.nextInt();
            int y = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (y == 1) {
                    continue;
                }
                if (a == 1) {
                    if (b >= h - y1) {
                        c++;
                        continue;
                    } else if (l > 1) {
                        l--;
                        c++;
                    } else {
                        y = 1;
                    }
                } else {
                    if (b <= y2) {
                        c++;
                    } else if (l > 1) {
                        l--;
                        c++;
                    } else {
                        y = 1;
                    }
                }
            }
            System.out.println(c);
        }
    }
}
