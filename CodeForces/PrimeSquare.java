package CodeForces;

import java.util.*;

public class PrimeSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int k = 1;
            if (n % 2 == 0) {
                for (int i = 1; i <= n; i = i + 2) {
                    for (int j = 1; j <= n;) {
                        if (i % 2 != 0 && j == k) {
                            System.out.print(1 + " " + 1 + " ");
                            j = j + 2;
                        } else {
                            System.out.print(0 + " ");
                            j++;
                        }
                    }
                    System.out.println();
                    for (int j = 1; j <= n;) {
                        if (i % 2 != 0 && j == k) {
                            System.out.print(1 + " " + 1 + " ");
                            j = j + 2;
                        } else {
                            System.out.print(0 + " ");
                            j++;
                        }
                    }
                    if (i % 2 != 0) {
                        k = k + 2;
                    }
                    System.out.println();
                }
            } else {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n;) {
                        if (i == n && j == 1 || i == n && j == n) {
                            System.out.print(1 + " ");
                            j++;
                        } else if (j != n && j == i) {
                            System.out.print(1 + " " + 1 + " ");
                            j = j + 2;
                        } else {
                            System.out.print(0 + " ");
                            j++;
                        }
                    }
                    if (i % 2 != 0) {
                        k++;
                    }
                    System.out.println();
                }
            }
        }
    }
}
