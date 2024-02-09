package CodeForces;

import java.util.*;

public class FastFoodRestaurant {

    public static int done(int a, int b, int c) {
        int count = 0;
        if (a != 0) {
            count++;
            a--;
        }
        if (c != 0) {
            count++;
            c--;
        }
        if (b != 0) {
            count++;
            b--;
        }
        if (a != 0 && b != 0) {
            count++;
            a--;
            b--;
        }
        if (a != 0 && c != 0) {
            count++;
            a--;
            c--;
        }
        if (c != 0 && b != 0) {
            count++;
            c--;
            b--;
        }

        if (a != 0 && b != 0 && c != 0) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] j = new int[3];
        for (int i = 0; i < n; i++) {
            j[0] = sc.nextInt();;
            j[1] = sc.nextInt();;
            j[2] = sc.nextInt();;
            Arrays.sort(j);
            System.out.println(done(j[2], j[1], j[0]));
        }
    }
}
