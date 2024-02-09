//package CSES;
import java.io.*;
import java.util.StringTokenizer;
	 
	public class CoinCombinations1 {
	 
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
	                }
	                catch (IOException e) {
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
	            }
	            catch (IOException e) {
	                e.printStackTrace();
	            }
	            return str;
	        }
	    }
	 
	    public static void main(String[] args) {
	 
	        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
	 
	        FastReader fsr = new FastReader();
	 
	        int n = fsr.nextInt();
	        int x = fsr.nextInt();
	 
	        int[] coins = new int[n];
	 
	        for (int i = 0; i < n; i++) {
	            coins[i] = fsr.nextInt();
	        }
	 
	        int MOD = 1000000007;
	 
	        int[] dp = new int[x + 1];
	 
	        dp[0] = 1;
	 
	        for (int i = 1; i <= x; i++) {
	            for (int j = 0; j < n; j++) {
	                if (i - coins[j] >= 0) {
	                    dp[i] += dp[i - coins[j]];
	                    if (dp[i] >= MOD) {
	                        dp[i] -= MOD;
	                    }
	                }
	            }
	        }
	 
	        out.println(dp[x]);
	 
	 
	        out.flush();
	        out.close();
	    }
	}