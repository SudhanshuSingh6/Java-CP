package CodeForces;

import java.util.*;

public class Dragons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int drag[] = new int[n];
        int add[] = new int[n];
        for (int i = 0; i < n; i++) {
            drag[i] = sc.nextInt();
            add[i] = sc.nextInt();
        }
        Integer[] idxs = new Integer[drag.length];
        for (int i = 0; i < drag.length; i++) {
            idxs[i] = i;
        }
        
        Arrays.sort(idxs, (o1l, o2) -> Integer.compare(drag[o1l], drag[o2]));
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (s > drag[idxs[i]]) {
                s += add[idxs[i]];
            } else {
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
