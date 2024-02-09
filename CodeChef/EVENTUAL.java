package CodeChef;

import java.io.*;
import java.util.*;

public class EVENTUAL {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			int n = sc.nextInt();
			String s = sc.next();
			int c = 0;
			boolean f = true;
			char[] arr = s.toCharArray();
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i] == arr[j])
						c++;
				}
				if (c % 2 != 0) {
					f = false;
					break;
				}
				c = 0;
			}

			log.write(f ? "YES" : "NO");
			log.write("\n");
		}
		log.flush();
	}
}
