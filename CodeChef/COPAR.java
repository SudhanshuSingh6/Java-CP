package CodeChef;

import java.util.*;

public class COPAR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder str = new StringBuilder();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            if (arr[0] > arr[n - 1]) {
                int s = 0;
                for (int i = 0; i < n; i++) {
                    if (arr[0] == arr[i]) {
                        s = i;
                    } else {
                        break;
                    }
                }
                str.append(s + 1 + "\n");
            } else {
                int s = n - 1;
                for (int i = 0; i < n; i++) {
                    if (arr[n - 1] == arr[i]) {
                        s = i;
                        break;
                    }
                }
                str.append(s + "\n");
            }
        }
        System.out.println(str);
    }
}
