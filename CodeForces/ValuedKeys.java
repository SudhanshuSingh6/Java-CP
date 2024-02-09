package CodeForces;

import java.util.*;

public class ValuedKeys {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        int m = 0;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) >= y.charAt(i)) {
                char l = (char) Math.min((int) x.charAt(i), (int) y.charAt(i));
                str.append(l);
            } else {
                m = 1;
                break;
            }
        }
        if (m != 0) {
            System.out.println(-1);
        } else {
            System.out.println(str);
        }
    }
}
