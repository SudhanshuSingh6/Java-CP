package CodeChef;

import java.util.*;

public class PINS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            StringBuilder q = new StringBuilder("1");
            for (int i = 1; i <= Math.floor(n / 2.0); i++) {
                q.append('0');
            }
            System.out.println(1 + " " + q + "\n");
        }
    }

}
