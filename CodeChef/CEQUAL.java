package CodeChef;

import java.util.*;

public class CEQUAL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            Set<Integer> ks = new HashSet<Integer>();
            for (int i = 0; i < n; i++) {
                ks.add(sc.nextInt());
            }
            if(ks.size()==n)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}