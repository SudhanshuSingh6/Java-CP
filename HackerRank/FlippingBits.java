package HackerRank;

import java.util.*;

public class FlippingBits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            long n = sc.nextLong();
            long k =4294967295L;
            System.out.println((long)(k ^ n));
        }
    }
}
