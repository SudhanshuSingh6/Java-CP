package CodeForces;

import java.util.*;

public class CommonPrefixes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder str = new StringBuilder();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            char[] s = new char[200];
            for (int i = 0; i < 200; i++) {
                s[i] = 'a';
            }
            System.out.println(s);
            for (int i = 0; i < n; i++) {
                s[a[i]] = (s[a[i]] == 'a' ? 'b' : 'a');
                System.out.println(s);
            }
        }
    }
}
