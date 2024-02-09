package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;

public class CHEFST {

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
            long n1 = sc.nextLong();
            long n2 = sc.nextLong();
            long m = sc.nextLong();
            long a = Math.min(n1, n2);
            long min = Math.min(n1, n2);
            long total = (m * (m + 1)) / 2;
            if (min <= total) {
                min = total;
                System.out.println(Math.max(n1, n2) - Math.min(n1, n2));
            }
            else
            System.out.println(n1-total + n2-total);

        }
    }
}
