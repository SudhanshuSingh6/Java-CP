package CodeChef;

import java.util.*;

public class FROGV {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = sc.nextInt();
        Integer[] arr = new Integer[n];
        Integer[] ar1 = new Integer[n];
        Integer[] ar2 = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            ar1[i] = i;
            ar2[i] = 0;
        }
        Arrays.sort(ar1, (o1l, o2) -> Integer.compare(arr[o1l], arr[o2]));
        Arrays.sort(arr);
        int c = 0;
        ar2[ar1[0]] = 0;
        for (int i = 1; i < n; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) <= k) {
                ar2[ar1[i]] = c;
            } else {
                c++;
                ar2[ar1[i]] = c;
            }
        }
        for (int i = 0; i < p; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (ar2[a - 1] == ar2[b - 1]) {
                str.append("Yes" + "\n");
            } else {
                str.append("No" + "\n");
            }
        }
        System.out.println(str);
    }
}
