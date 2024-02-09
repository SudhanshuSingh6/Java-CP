package CodeChef;

import java.util.*;

public class TRISQ {

    public static int numberOfSquares(int base) {
        base = (base - 2);
        base = Math.floorDiv(base, 2);

        return base * (base + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            System.out.println(numberOfSquares(s));

        }
    }
}
