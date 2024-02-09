package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ALTARAY {

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
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] < 0) {
                    arr[i] = -1;
                } else {
                    arr[i] = 1;
                }
            }
            int c = 1;
            int k = 0;
            int[] ar = new int[n];
            Arrays.fill(ar, 1);
            for (int i = n - 1; i >= 1; i--) {
                if (arr[i] != arr[i - 1]) {
                    ++c;
                    ar[i - 1] = c;
                } else {
                    c = 1;
                }
            }
            System.out.println(Arrays.toString(ar).replace("[", "").replace("]", "").replace(",", ""));
        }
    }
}
