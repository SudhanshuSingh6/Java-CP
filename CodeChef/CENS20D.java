package CodeChef;

import java.util.*;

public class CENS20D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int c = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if ((arr[i] & arr[j]) == arr[i]) {
                        c = c + 1;
                    }
                }
            }
            System.out.println(c);
        }
    }
}
