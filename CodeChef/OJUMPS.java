package CodeChef;

import java.util.*;

public class OJUMPS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        n = n % 6;
        if (n == 0 || n == 3 || n == 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
