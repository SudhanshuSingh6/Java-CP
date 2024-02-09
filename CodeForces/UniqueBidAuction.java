package CodeForces;

import java.util.*;

public class UniqueBidAuction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> arr = new HashMap();
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                ar[i] = a;
                arr.put(a, arr.getOrDefault(a, 0) + 1);
            }
            int c = Integer.MAX_VALUE;
            int d = 0;
            for (int i : arr.keySet()) {
                if (arr.get(i) == 1) {
                    c = Math.min(c, i);
                }
            }
            if (c == Integer.MAX_VALUE) {
                System.out.println(-1);
            } else {
                for (int i = 0; i < n; i++) {
                    if (ar[i] == c) {
                        d = i;
                        break;
                    }
                }
                System.out.println(d + 1);
            }
        }
    }
}
