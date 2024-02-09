package CodeForces;

import java.util.*;

public class SavingTheCity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            String s = sc.next();
            int n = s.length(), flag = -1, c = 0, ans = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    if (flag == -1) {
                        flag = 0;
                        c = 0;
                        ans += a;
                    } else {
                        ans += Math.min(c * b, a);
                        c = 0;
                    }
                } else {
                    c++;
                }
            }
            System.out.println(ans);
        }
    }
}
