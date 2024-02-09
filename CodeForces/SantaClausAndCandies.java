package CodeForces;

import java.util.*;

public class SantaClausAndCandies {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = (-1+(int)(Math.sqrt(1+(8*k))))/2;
        System.out.println(a);
        int s = k - (a * (a + 1) / 2);
        int i = 0;
        for (i = 1; i < a; i++) {
            System.out.print(i + " ");
        }
        System.out.print(i + s);
    }
}
