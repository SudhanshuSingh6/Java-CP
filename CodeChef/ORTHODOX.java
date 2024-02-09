package CodeChef;

import java.io.*;
import java.util.*;

public class ORTHODOX {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			int n = sc.nextInt();
			Long[] arr = new Long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextLong();
			}
			boolean flag = true;
			ArrayList<Long> al = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				long or = 0;
				for (int j = i; j < n; j++) {
					or = or | arr[j];
					if (al.contains(or)) {
						flag = false;
						break;
					}
					al.add(or);
				}
				if (!flag)
					break;
			}
			log.write(flag ? "YES" : "NO");
			log.write( "\n");
		}
		log.flush();
		sc.close();
	}
}
