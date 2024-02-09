package CodeForces;

import java.util.*;

public class DistrictsConnection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = 1;
        for (int i = 1; i < n; i++) {
            k = k * i;
        }
        k=k/(n/2);
        System.out.println(k);
    }
}
