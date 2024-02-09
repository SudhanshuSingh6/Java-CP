package CodeForces;

import java.util.*;

public class FillingShapes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 1) {
            System.out.println(0);
        } else {
            System.out.println((long)Math.pow(2,n/2));
        }
    }
}
