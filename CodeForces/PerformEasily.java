package CodeForces;

import java.util.*;

public class PerformEasily {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long[] ar = new Long[6];
        for (int i = 0; i < 6; i++) {
            ar[i] = sc.nextLong();
        }
        int n = sc.nextInt();
        SortedSet<Long> arr = new TreeSet();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextLong());
        }
        int p = arr.size();
        Long arr1[] = new Long[p];
        arr1 = arr.toArray(arr1);
        Arrays.sort(ar);
        if (p > 1) {
            System.out.println((long) Math.abs((arr1[0] - ar[0]) - (arr1[p - 1] - ar[5])));
        } else {
            System.out.println((long) Math.abs(arr1[0] - ar[5]));
        }
    }
}
