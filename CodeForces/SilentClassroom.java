package CodeForces;

import java.util.*;

public class SilentClassroom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] arr = new String[t];
        int[] ar = new int[26];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.next();
            ar[arr[i].charAt(0) - 'a']++;
        }
        int s = 0;
        for (int i = 0; i < 26; i++) {
            s = s + (ar[i] / 2 * ((ar[i] / 2) - 1)) / 2;
            s = s + ((ar[i] - (ar[i] / 2)) * ((ar[i] - (ar[i] / 2)) - 1)) / 2;
        }
        System.out.println(s);
    }
}
