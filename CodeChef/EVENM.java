package CodeChef;

import java.io.*;
import java.util.*;

public class EVENM {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			int n = sc.nextInt();
			int a = 0;
			int b = 1;
			int p = 0;
			int k=0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (p == 0) {
						log.write(b + " ");
						b = b + 2;
						p = 1;
					} else {
						a = a + 2;
						log.write(a + " ");
						p = 0;
					}
				}
				if(k==0)
				{
					p=1;
					k=1;
				}
				else
				{
					p=0;
					k=0;
				}
				log.write("\n");
			}
		}
		log.flush();
	}
}
