package CodeChef;

import java.util.*;

public class ADASCOOL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a % 2 == 0 || b % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
