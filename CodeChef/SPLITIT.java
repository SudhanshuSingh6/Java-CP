package CodeChef;

import java.util.*;

public class SPLITIT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            String s = sc.next();
            String k = "";
            k = k + (s.charAt(s.length() - 1));
            String p = s.substring(0, s.length() - 1);
            if (p.contains(k)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
