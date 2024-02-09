package CodeChef;

import java.io.*;
import java.util.*;

public class CDQU5 {

    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            if (n == 1) {
                log.write(0 + "\n");
            } else if (n == 2) {
                log.write(1 + "\n");
            } else if (n == 3) {
                log.write(1 + "\n");
            } else {
                long[] arr = new long[n + 1];
                arr[1] = 0;
                arr[2] = 1;
                arr[3] = 1;
                for (int i = 4; i <= n; i++) {
                    arr[i] = (arr[i - 2] + arr[i - 3]) % 1000000009;
                }
                int c = (int) arr[n] % 1000000009;
                log.write(c + "\n");
            }
        }
        log.flush();
    }
}
