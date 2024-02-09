package CodeChef;

import java.util.*;

public class ANDOR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            long n = sc.nextInt();
            System.out.println(n - (n / 2) + " " + (n / 2));
        }
    }
}
