package CodeChef;

import java.util.*;

public class COMPILER {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            String s = sc.next();
            int c = 0;
            int a = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '<') {
                    c++;
                } else {
                    c--;
                    if (c == -1) {
                        break;
                    } else if (c == 0) {
                        a = Math.max(a, i + 1);
                    }
                }
            }
            System.out.println(a);
        }
    }
}
