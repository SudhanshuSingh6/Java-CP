package CodeChef;
import java.io.*;
import java.util.*;
public class AMMEAT {
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
		PrintWriter out=new PrintWriter(System.out);
		int t = sc.nextInt();
		for(int x=0;x<t;x++)
		{
			int n = sc.nextInt();
			long m = sc.nextLong();
			long[] arr = new long[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextLong();
			}
			Arrays.sort(arr);
			int c =0;
			for(int i=n-1;i>=0;i--)
			{
				m=m-arr[i];
				c++;
				if(m<=0)
					break;
			}
			if(m>0)
		    out.println(-1);
			else
			out.println(c);
		}
		out.flush();
	}
}
