package CodeChef;

import java.util.*;

public class BRKBKS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            double sum = 0;
            double s = sc.nextInt();
            double w1 = sc.nextInt();
            double w2 = sc.nextInt();
            double w3 = sc.nextInt();
            int c = 0;
            if (w1 + w2 + w3 <= s) {
                c = 1;
            } else if (w1 + w2 <= s && w3 <= s || w3 + w2 <= s && w1 <= s) {
                c = 2;
            } else {
                c = 3;
            }
            System.out.println(c);
        }
    }
}
