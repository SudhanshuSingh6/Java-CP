package CodeChef;

import java.util.*;

public class MarketingScheme {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int a = sc.nextInt();
            double b = sc.nextInt();
            if (b / 2 < a) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
