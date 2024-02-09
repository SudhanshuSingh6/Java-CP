package CodeForces;

import java.util.*;

public class BuggySorting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1||n==2) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(n - i + " ");
            }
        }
    }
}
