package CodeForces;

import java.util.*;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1, ans = 0;
        while (n > 0) {
            if (sum(i) == 10) {
                ans = i;
                n--;
            }
            i++;
        }
        System.out.println(ans);
    }

    static int sum(long n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
