package HackerRank;

import java.io.*;
import java.util.*;

public class SherlockAndTheBeast {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			int n = sc.nextInt();
			StringBuilder s = new StringBuilder(); 
			int k = n % 3;
			int z = n;
			while (z % 3 != 0) {
				z -= 5;
			}
			if (z < 0) {
				log.write(-1+"\n");
			} else {
				for (int i = 0; i < z; i++) {
					s .append(5);
				}
				for (int i = 0; i < n - z; i++) {
					s.append(3);
				}
				log.write(s+"\n");
			}
		}
		log.flush();
	}
}
