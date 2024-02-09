package HackerRank;

import java.util.*;
import java.math.*;

public class BigSorting {

    static String[] bigSorting(String[] unsorted) {
        Arrays.sort(unsorted, (x, y) -> x.length() == y.length() ? x.compareTo(y) : Integer.compare(x.length(), y.length()));
        return unsorted;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] unsorted = new String[n];
        for (int i = 0; i < n; i++) {
            String unsortedItem = sc.next();
            unsorted[i] = unsortedItem;
        }
        String[] result = bigSorting(unsorted);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
