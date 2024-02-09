package CodeChef;

import java.io.*;
import java.util.*;

public class GRGUY {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = sc.nextInt();
		for (int z = 0; z < t; z++) {
			String l1 = sc.next();
			String l2 = sc.next();
			char[] a = l1.toCharArray();
			char[] b = l2.toCharArray();
			int c = 0;
			int d = 0;
			int f = 1;
			int m = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] == '#' && b[i] == '#') {
					c = 1;
					break;
				} else if (m == 0) {
					if (a[i] == '#' || b[i] == '#') {
						m = 1;
						if (a[i] == '#')
							f = 0;
					}
				} else if (m == 1) {
					if (a[i] == '.' || b[i] == '.') {
						if (a[i] == '#' && f == 1) {
							d++;
							f = 0;
						} else if (b[i] == '#' && f == 0) {
							d++;
							f = 1;
						}
					}
				}
			}
			if (c == 0) {
				log.write("Yes"+"\n");
				log.write(d+"\n");
			} else
				log.write("No"+"\n");
		}
		log.flush();
	}
}
