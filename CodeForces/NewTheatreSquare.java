package CodeForces;

import java.util.*;

public class NewTheatreSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int p = 0; p < t; p++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            char[][] arr = new char[n][m];
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                arr[i] = s.toCharArray();
            }
            int l = 0;
            if (x * 2 <= y) {
                l = 1;
            }
            int s = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (l == 0) {
                        if (j + 1 < m && arr[i][j] == '.' && arr[i][j + 1] == '.') {
                            s = s + y;
                            arr[i][j + 1] = '1';
                        } else if (arr[i][j] == '.') {
                            s = s + x;
                        }
                    } else {
                        if (arr[i][j] == '.') {
                            s = s + x;
                        }
                    }
                }
            }
            System.out.println(s);
        }
    }
}
