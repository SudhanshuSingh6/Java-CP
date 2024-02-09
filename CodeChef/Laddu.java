package CodeChef;

import java.util.*;

public class Laddu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int l = 0; l < t; l++) {
            long activites = sc.nextLong();
            String origin = sc.next();
            long laddus = 0;
            long j = 0;
            for (; j < activites; j++) {
                String act = sc.next();

                if (act.equals("CONTEST_WON")) {
                    long rank = sc.nextLong();
                    if (rank <= 20) {
                        laddus += (320 - rank);
                    } else {
                        laddus += 300;
                    }
                } else if (act.equals("TOP_CONTRIBUTOR")) {
                    laddus += 300;
                } else if (act.equals("BUG_FOUND")) {
                    long x = sc.nextLong();
                    laddus += x;
                } else {
                    laddus += 50;
                }

            }
            System.out.println(origin.equals("INDIAN") ? (laddus / 200) : (laddus / 400));
        }

    }
}
