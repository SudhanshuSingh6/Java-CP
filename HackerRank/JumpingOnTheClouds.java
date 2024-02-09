package HackerRank;

import java.util.*;

public class JumpingOnTheClouds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = 0;
        int l = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                c = c + (k / 2);
                k = 0;
                c++;
            } else {
                k++;
            }
        }
        System.out.println(c+k/2);
    }
}
