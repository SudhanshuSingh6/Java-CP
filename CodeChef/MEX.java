package CodeChef;


import java.io.*;
import java.util.*;

public class MEX {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
		for (int z = 0; z < t; z++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			SortedSet<Integer> arr = new TreeSet<Integer>();
			for (int i = 0; i < n; i++) {
				arr.add(sc.nextInt());
			}
			ArrayList<Integer> ar = new ArrayList();
			ar.addAll(arr);
			int p = 0;
			int c = 0;
			for (int i = 0; i <= ar.get(ar.size() - 1); i++) {
				if (k < 0)
					break;
				if (i != ar.get(c) && k >= 0) {
					k--;
					p = i;
				} else {
					c++;
					p = i + k + 1;
					if (c == ar.size())
						break;
				}
			}
			out.println(p);
		}
		out.flush();
	}
}
