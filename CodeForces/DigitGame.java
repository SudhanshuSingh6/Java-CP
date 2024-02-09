package CodeForces;

import java.util.*;

public class DigitGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder res = new StringBuilder();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            String s = sc.next();
            int ans = -1;
            if (n % 2 == 0) {
                for (int i = 1; i < n; i += 2) {
                    if ((s.charAt(i) - 48) % 2 == 0) {
                        ans = 2;
                        break;
                    }
                }
                if (ans == 2) {
                    res.append(2 + "\n");
                } else {
                    res.append(1 + "\n");
                }
            } else {
                for (int i = 0; i < n; i += 2) {
                    if ((s.charAt(i) - 48) % 2 == 1) {
                        ans = 1;
                        break;
                    }
                }
                if (ans == 1) {
                    res.append(1 + "\n");
                } else {
                    res.append(2 + "\n");
                }
            }
        }
        System.out.println(res);
    }
}
