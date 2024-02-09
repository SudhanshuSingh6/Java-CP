package CodeChef;

import java.util.*;

public class GIFTSRC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            String s = sc.next();
            int l = 0;
            int r = 0;
            if (s.charAt(0) == 'L') {
                l--;
            }
            if (s.charAt(0) == 'R') {
                l++;
            }
            if (s.charAt(0) == 'U') {
                r++;
            }
            if (s.charAt(0) == 'D') {
                r--;
            }
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == 'L') {
                    if (s.charAt(i - 1) != 'L'&&s.charAt(i - 1) != 'R') {
                        l--;
                    }
                }
                if (s.charAt(i) == 'R') {
                    if (s.charAt(i - 1) != 'R'&&s.charAt(i - 1) != 'L') {
                        l++;
                    }
                }
                if (s.charAt(i) == 'U') {
                    if (s.charAt(i - 1) != 'U'&&s.charAt(i - 1) != 'D') {
                        r++;
                    }
                }
                if (s.charAt(i) == 'D') {
                    if (s.charAt(i - 1) != 'D'&&s.charAt(i - 1) != 'U') {
                        r--;
                    }
                }
            }
            System.out.println(l + " " + r);
        }
    }
}
