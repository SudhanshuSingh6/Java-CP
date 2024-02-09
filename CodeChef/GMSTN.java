package CodeChef;

import java.util.Scanner;

public class GMSTN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            int x = 0;
            int y = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] % 2 == 0) {
                    x++;
                } else {
                    y++;
                }
            }
            int a = 0;
            if (m >= 2 * y) {
                a = 0;
            } else if (m >= 2 * x) {
                a = (n - m) % 2;
            } else {
                a = m % 2;
            }
            if (a % 2 != 0) {
                System.out.println("Walter");
            } else {
                System.out.println("Jesse");
            }
        }
    }
}
