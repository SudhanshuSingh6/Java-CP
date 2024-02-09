package CodeChef;

import java.util.*;

public class CHEFSQRS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            if (n%2 == 0||n==1) {
                System.out.println(-1);
            } else {
                System.out.println((long) Math.pow(n/2, 2));
            }
        }
    }
}
