package CodeForces;

import java.util.*;

public class QueueAtTheSchool {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();
        while (t-- > 0) {
            s = s.replaceAll("BG", "GB");
        }
        System.out.println(s);
    }
}
