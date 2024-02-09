package CodeChef;

import java.io.*;
import java.util.*;

public class REPLESX {

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
        for (int u = 0; u < t; u++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int p = sc.nextInt();
            int k = sc.nextInt();
            int a = 1;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == x) {
                    a = 0;
                }
            }

            Arrays.sort(arr);
            if (arr[p - 1] == x) {
                log.write(0 + "\n");
            } else if (arr[p - 1] >= x && k >= p) {
                int b = 0;
                for (int i = p - 1; i >= 0; i--) {
                    if (arr[i] > x) {
                        b++;
                    }
                }
                log.write(b + "\n");
            } else if (k <= p && arr[p - 1] <= x) {
                int b = 0;
                for (int i = p - 1; i < n; i++) {
                    if (arr[i] < x) {
                        b++;
                    }
                }
                log.write(b + "\n");
            } else {
                log.write(-1 + "\n");
            }
        }
        log.flush();
    }
}
