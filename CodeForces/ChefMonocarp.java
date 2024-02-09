package CodeForces;

import java.util.*;

public class ChefMonocarp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int c = 0;
            int m = 0;
            int l = 0;
            int h = 0;
            SortedSet<Integer> arr1 = new <Integer>TreeSet();
            arr1.addAll(arr);
            for (int i = 0; i < n; i++) {
                h = arr[i] % 2 == 0 ? arr[i] / 2 : arr[i] / 2 + 1;
                c = c + Math.abs(arr[i] - (h));
                l = l + arr[i];
                m = m + Math.abs(arr[i] - (i + 1));
            }
            System.out.println(l + " " + c + " " + m + " " + Arrays.toString(arr));
        }
    }
}
