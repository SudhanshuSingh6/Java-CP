package HackerRank;

import java.util.*;

public class CounterGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            Long n = sc.nextLong();
            int count = 0;
            n=n-1;
            while (n!=0) {
                n &= (n - 1);
                count++;
            }
            if((count&1)==0)
                System.out.println("Louise");
            else
                System.out.println("Richard");
        }
    }
}
