package CodeChef;

import java.util.*;

public class POSPREFS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            int c = 0;
            int s = 0;
            if (n % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    if ((i + 1) % 2 == 0) {
                        arr[i] = i + 1;
                    } else {
                        arr[i] = -(i + 1);
                    }
                    s = s + arr[i];
                    if (s > 0) {
                        c++;
                    }
                }
            }
            if (n % 2 != 0) {
                for (int i = 0; i < n; i++) {
                    if ((i + 1) % 2 != 0) {
                        arr[i] = i + 1;
                    } else {
                        arr[i] = -(i + 1);
                    }

                    s = s + arr[i];
                    if (s > 0) {
                        c++;
                    }
                }
            }
            if (c > k) {
                for (int i = n - 1; i >= 0; i--) {
                    if (arr[i] > 0) {
                        arr[i] = -(i + 1);
                        c--;
                    }
                    if (c == k) {
                        break;
                    }
                }
            }
            if (c < k) {
                for (int i = n - 1; i >= 0; i--) {
                    if (arr[i] < 0) {
                        arr[i] = (i + 1);
                        c++;
                    }
                    if (c == k) {
                        break;
                    }
                }
            }
            str.append(Arrays.toString(arr).replace(",", "").replace("[", "").replace("]", "") + "\n");
        }
        System.out.println(str);
    }
}
