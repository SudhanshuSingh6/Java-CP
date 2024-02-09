package CodeChef;

import java.util.*;

public class PERMUT2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                System.exit(0);
            }
            int[] arr = new int[n];
            int[] crr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                crr[arr[i] - 1] = i + 1;
            }
            if (Arrays.equals(arr, crr)) {
                System.out.println("ambiguous");
            } else {
                System.out.println("not ambiguous");
            }
        }
    }
}
