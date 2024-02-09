package CodeForces;

import java.util.*;

public class NumberIntoSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            Set<Long> ar = new HashSet();
            for (long i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (n / i == i) {
                        ar.add((long) i);

                    } else {
                        ar.add((long) i);

                        ar.add(n / i);
                    }
                }
            }
            
        }
    }
}
