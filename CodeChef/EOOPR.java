package CodeChef;

import java.util.Scanner;

public class EOOPR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == y) {
                System.out.println(0);
            } else if (x > y) {
                if (x % 2 == 0 && y % 2 == 0) {
                    System.out.println(1);
                } else if (x % 2 != 0 && y % 2 != 0) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            } else {
                if (x % 2 == 0 && y % 2 == 0) {
                    int k = (y - x) / 2;
                    if (k % 2 == 0) {
                        System.out.println(3);
                    } else {
                        System.out.println(2);
                    }
                } else if (x % 2 != 0 && y % 2 != 0) {
                    int k = (y - x) / 2;
                    if (k % 2 == 0) {
                        System.out.println(3);
                    } else {
                        System.out.println(2);
                    }
                } else {
                    System.out.println(1);
                }
            }
        }
    }
}
