package CodeForces;

import java.util.*;

public class ReverseBinaryStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            String s = sc.next();
            int c = 0;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    c++;
                }
            }
            System.out.println((n-c)/2);
        }
    }
}
