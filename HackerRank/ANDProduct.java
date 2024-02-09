package HackerRank;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class ANDProduct {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = a;
            for (long i = a + 1; i <= b; i++) {
                c = c & i;
            }
            log.write(c + "\n");
        }
        log.flush();
    }
}
