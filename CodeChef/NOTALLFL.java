package CodeChef;

import java.util.*;

public class NOTALLFL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder str = new StringBuilder();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            Set<Integer> ar = new HashSet();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int c = 0;
            int m = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    ar.add(arr[j]);
                    if (ar.size() < k) {
                        c++;
                    } else {
                        break;
                    }
                }
                ar.clear();
                m = Math.max(c, m);
                c = 0;
                if (m >= n - i + 1) {
                    break;
                }
            }
            str.append(m + "\n");
        }
        System.out.println(str);
    }
}
