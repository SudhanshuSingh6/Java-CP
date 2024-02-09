package CodeChef;

import java.util.*;

public class EVENT {

    public static int getInt(String s) {
        if (s.equalsIgnoreCase("monday")) {
            return 1;
        } else if (s.equalsIgnoreCase("tuesday")) {
            return 2;
        } else if (s.equalsIgnoreCase("wednesday")) {
            return 3;
        } else if (s.equalsIgnoreCase("thursday")) {
            return 4;
        } else if (s.equalsIgnoreCase("friday")) {
            return 5;
        } else if (s.equalsIgnoreCase("saturday")) {
            return 6;
        } else if (s.equalsIgnoreCase("sunday")) {
            return 7;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String input[] = sc.nextLine().split(" ");
            int startDay = getInt(input[0]);
            int endDay = getInt(input[1]);
            int l = Integer.parseInt(input[2]);
            int r = Integer.parseInt(input[3]);
            int d = endDay - startDay;
            if (d >= 0) {
                d = d + 1;
            }
            if (d < 0) {
                d = 8 + d;
            }
            int min = d;
            int k = 1;
            int ex = 0;
            int count = 0;
            while (min <= r) {
                if (min >= l && min <= r) {
                    count++;
                    ex = min;
                }
                min += 7;
            }
            if (count == 1) {
                System.out.println(ex);
            } else if (count > 1) {
                System.out.println("many");
            } else {
                System.out.println("impossible");
            }
        }
    }
}
