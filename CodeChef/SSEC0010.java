package CodeChef;

import java.util.*;

public class SSEC0010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s1 = "S";
            String s2 = "SS";
            String s3 = "SSE";
            String s4 = "SSEC";
            String s5 = "SSE";
            String s6 = "SS";
            String s7 = "S";
            int k = 0;
            if (n > 7) {
                k = n % 7;
                if (k == 1) {
                    for (int j = 0; j < s1.length(); j++) {
                        System.out.print((int) s1.charAt(j) + " ");
                    }
                }
                if (k == 2) {
                    for (int j = 0; j < s2.length(); j++) {
                        System.out.print((int) s2.charAt(j) + " ");
                    }
                }
                if (k == 3) {
                    for (int j = 0; j < s3.length(); j++) {
                        System.out.print((int) s3.charAt(j) + " ");
                    }
                }
                if (k == 4) {
                    for (int j = 0; j < s4.length(); j++) {
                        System.out.print((int) s4.charAt(j) + " ");
                    }
                }
                if (k == 5) {
                    for (int j = 0; j < s5.length(); j++) {
                        System.out.print((int) s5.charAt(j) + " ");
                    }
                }
                if (k == 6) {
                    for (int j = 0; j < s6.length(); j++) {
                        System.out.print((int) s6.charAt(j) + " ");
                    }
                }
                if (k == 0) {
                    for (int j = 0; j < s7.length(); j++) {
                        System.out.print((int) s7.charAt(j) + " ");
                    }
                }
            } else {
                k = n;
                if (k == 1) {
                    for (int j = 0; j < s1.length(); j++) {
                        System.out.print((int) s1.charAt(j) + " ");
                    }
                }
                if (k == 2) {
                    for (int j = 0; j < s2.length(); j++) {
                        System.out.print((int) s2.charAt(j) + " ");
                    }
                }
                if (k == 3) {
                    for (int j = 0; j < s3.length(); j++) {
                        System.out.print((int) s3.charAt(j) + " ");
                    }
                }
                if (k == 4) {
                    for (int j = 0; j < s4.length(); j++) {
                        System.out.print((int) s4.charAt(j) + " ");
                    }
                }
                if (k == 5) {
                    for (int j = 0; j < s5.length(); j++) {
                        System.out.print((int) s5.charAt(j) + " ");
                    }
                }
                if (k == 6) {
                    for (int j = 0; j < s6.length(); j++) {
                        System.out.print((int) s6.charAt(j) + " ");
                    }
                }
                if (k == 7) {
                    for (int j = 0; j < s7.length(); j++) {
                        System.out.print((int) s7.charAt(j) + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
