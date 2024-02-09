package CodeForces;

import java.util.*;

public class LettersRearranging {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            String s = sc.next();
            char arr[] = s.toCharArray();
            Arrays.sort(arr);
            int n = arr.length;
            String ans;
            if (arr[0] == arr[n - 1]) {
                ans = "-1";
            } else {
                ans = new String(arr);
            }
            System.out.println(ans);
        }
    }
}
