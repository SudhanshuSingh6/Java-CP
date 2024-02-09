package CodeChef;

import java.util.*;

public class CVDRUN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int o = 0; o < t; o++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int c = 0;
            int b = 0;
            Set<Integer> h = new HashSet();
            while (c >= 0) {
                c++;
                b = (x + k) % n;
                h.add(b);
                x = b;
                if (h.size() < c) {
                    break;
                }
            }
            int a = 0;
            for (int l : h) {
                if (l == y) {
                    System.out.println("YES");
                    a = 1;
                    break;
                }
            }
            if (a != 1) {
                System.out.println("NO");
            }
        }
    }
}
