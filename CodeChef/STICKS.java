package CodeChef;

import java.util.*;

class STICKS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int count = 0;
            int length = 0;
            int ans = -1;
            Arrays.sort(a);
            for (int i = n - 1; i > 0; i--) {
                if (a[i] == a[i - 1]) {
                    i--;
                    if (count == 0) {
                        count = 1;
                        length = a[i];
                    } else {
                        count = 2;
                        ans = a[i] * length;
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
