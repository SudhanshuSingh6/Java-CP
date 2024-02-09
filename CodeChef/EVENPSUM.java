package CodeChef;

import java.util.*;

public class EVENPSUM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            long c = ((a / 2) * (b / 2)) + ((a - (a / 2)) * (b - (b / 2)));
            System.out.println(c);
        }
    }
}
