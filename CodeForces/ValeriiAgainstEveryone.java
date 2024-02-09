package CodeForces;

import java.util.*;

public class ValeriiAgainstEveryone {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            Set<Integer> arr = new HashSet();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                arr.add(a);
            }
            if (arr.size() == n) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
