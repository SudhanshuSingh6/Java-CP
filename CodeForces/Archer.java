package CodeForces;

import java.util.*;

public class Archer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double d = sc.nextInt();
        System.out.println((a / b) / (1 - ((1 - (c / d)) * (1 - (a / b)))));
    }
}
