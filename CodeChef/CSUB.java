package CodeChef;

import java.util.Scanner;

public class CSUB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            String s = sc.next();
            long c = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    c++;
                }
            }
            long h = ((c * (c + 1)) / 2);
            System.out.println(h);
        }
    }
}
