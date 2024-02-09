package CodeForces;

import java.util.Scanner;

public class RobotProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            long m = sc.nextLong();
            long s = sc.nextLong();
            if (m == s) {
                System.out.println(m + s);
            } else {
                System.out.println(Math.max(s, m) + Math.max(s, m) - 1);
            }
        }
    }
}
