package CodeForces;

import java.util.*;

public class SequenceTransformation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            HashMap<Integer, Integer> ar = new HashMap();
            HashMap<Integer, Integer> ar1 = new HashMap();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                arr[i] = a;
                if (ar.containsKey(a)) {
                    if (Math.abs(ar.get(a) - i) != 1) {
                        ar1.put(a, ar1.get(a) + 1);
                        ar.replace(a, i);
                    } else {
                        ar.replace(a, i);
                    }
                } else {
                    if (i == 0) {
                        ar.put(a, i);
                        ar1.put(a, 0);
                    } else {
                        ar.put(a, i);
                        ar1.put(a, 1);
                    }
                }
            }
            for (int i : ar1.keySet()) {
                if (arr[n - 1] != i) {
                    ar1.replace(i, ar1.get(i) + 1);
                }
            }
            int c = Integer.MAX_VALUE;
            for (int i : ar1.values()) {
                c = Math.min(c, i);
            }
            str.append(c + "\n");
        }
        System.out.println(str);
    }
}