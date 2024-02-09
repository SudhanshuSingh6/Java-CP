package CodeForces;

import java.io.*;
import java.util.*;

public class Reorder {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            long s = 0;
            for (int i = 0; i < n; i++) {
                s = s + arr[i];
            }
            if (s == k) {
                log.write("YES" + "\n");
            } else {
                log.write("NO" + "\n");
            }
        }
        log.flush();
    }
}
