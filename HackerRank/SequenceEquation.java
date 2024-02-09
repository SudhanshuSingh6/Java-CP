package HackerRank;

import java.util.*;

public class SequenceEquation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] crr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            crr[arr[i] - 1] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(crr[crr[i] - 1]);
        }
    }
}
