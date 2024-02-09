package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ICL1801 {

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

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n * m];
            int c = 0;
            int g = 0;
            for (int i = 0; i < n * m; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int a = 1;
            for (int i = arr.length - 1; i >= 0; i--) {
                if (a == 1) {
                    c = c + arr[i];
                    a = 0;
                } else {
                    g = g + arr[i];
                    a = 1;
                }
            }
            if (c > g) {
                System.out.println("Cyborg");
            } else if (g > c) {
                System.out.println("Geno");
            } else {
                System.out.println("Draw");
            }
        }
    }
}
