package CodeForces;

import java.util.*;

public class SubsetMex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            Set<Integer> s1 = new HashSet<>(), s2 = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (s1.contains(num)) {
                    s2.add(num);
                } else {
                    s1.add(num);
                }
            }
            System.out.println(mex(s1) + mex(s2));
        }
    }
    public static int mex(Set<Integer> s) {
        for (int i = 0; i <= 100; i++) {
            if (!s.contains(i)) {
                return i;
            }
        }
        return 0;
    }
}