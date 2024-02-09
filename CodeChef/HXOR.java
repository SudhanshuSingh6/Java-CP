package CodeChef;

import java.util.*;

public class HXOR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int xx = 0; xx < t; xx++) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            int i = 0;
            while (i < n - 1) {

                int f = 1;
                long result = 1 << ((long) (Math.log(arr[i]) / Math.log(2)));

                arr[i] = arr[i] ^ result;
                for (int j = i + 1; j < n; j++) {
                    if ((arr[j] ^ result) < arr[j]) {
                        arr[j] = arr[j] ^ result;
                        f = 0;
                        break;
                    }

                }
                if (f == 1) {
                    arr[n - 1] = arr[n - 1] ^ result;
                }
                while (i < n && arr[i] == 0) {
                    i++;
                }

                x--;
                if (x == 0) {
                    break;
                }
            }
            if (n < 3) {
                if (x % 2 != 0) {
                    arr[0] = arr[0] ^ 1;
                    arr[1] = arr[1] ^ 1;
                }
            }
            System.out.println(Arrays.toString(arr).replace(",", "").replace("[", "").replace("]", ""));
        }
    }
}
