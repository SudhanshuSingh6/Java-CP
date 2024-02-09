package CodeChef;

import java.util.*;

public class CIELRCPT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int h = k;
            int n = sc.nextInt();
            int c = 0;
            for (int l = 11; l >= 0; l--) {

                if (n / (int) Math.pow(2, l) > 0) {

                    c = c + n / (int) Math.pow(2, l);
                    n = n % (int) Math.pow(2, l);
                }
            }

            System.out.println(c);
        }

    }
}
