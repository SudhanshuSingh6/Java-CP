package CodeForces;

import java.util.*;

public class TilingChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] a = new char[n][n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next().toCharArray();
        }
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (a[i][j] == '.' && a[i - 1][j] == '.' && a[i][j + 1] == '.' && a[i][j - 1] == '.' && a[i + 1][j] == '.') {
                    a[i][j] = '#';
                    a[i - 1][j] = '#';
                    a[i + 1][j] = '#';
                    a[i][j - 1] = '#';
                    a[i][j + 1] = '#';
                }
            }
        }
        int m = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == '.') {
                    m = 1;
                    break;
                }
            }
        }
        if (m == 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
