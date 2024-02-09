package CodeChef;

import java.util.*;

public class SSO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            long s = 0;
            long p = 0;
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                p = p + a;
                s = s | a | p;
            }
            str.append(s + "\n");
        }
        System.out.println(str);
    }
}
