package CodeChef;

import java.io.*;
import java.util.*;

public class POSAND {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = sc.nextInt();
        for (int f = 0; f < t; f++) {
            int n = sc.nextInt();
            if (n == 1) {
                log.write("1");
                log.write("\n");
                log.flush();
            } else if ((n & (n - 1)) == 0) {
                log.write("-1");
                log.write("\n");
                log.flush();
            } else {
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = i + 1;
                }
                arr[0] = 2;
                arr[1] = 3;
                arr[2] = 1;
                for (int i = 3; i < n; i++) {
                    if ((arr[i] & arr[(i - 1)]) == 0) {
                        int temp = arr[i + 1];
                        int k = arr[i];
                        arr[i] = temp;
                        arr[i + 1] = k;
                    }
                }
                for (int i = 0; i < n; i++) {
                    log.write(arr[i] + " ");
                }
                log.write("\n");
                log.flush();
            }
        }
    }
}
