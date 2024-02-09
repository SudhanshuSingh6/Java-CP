package CodeChef;

import java.util.*;

public class VK18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            double n = sc.nextInt();
            double s = n / 2*((n*n)+n);
            System.out.println((long)(((n * (n + 1) / 2) * n) + s));
        }
    }
}
