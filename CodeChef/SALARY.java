package CodeChef;

import java.util.*;

public class SALARY {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int m = 0;
            int l = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int p = sc.nextInt();
                m = m + p;
                if (l > p) {
                    l = p;
                }
            }
            System.out.println(m - l * n);
        }
    }
}
