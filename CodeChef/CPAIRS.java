package CodeChef;

import java.util.*;

public class CPAIRS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x = 0; x < n; x++) {
            int m = sc.nextInt();
            int sum = 0;
            int p = 0;
            int[] arr = new int[m];
            for (int i = 0; i < m; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                if ((arr[i] & 1) == 0) {
                    sum++;
                } else {
                    p += sum;
                }
            }
            System.out.println(p);
        }
    }
}
