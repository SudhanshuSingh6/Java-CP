package CodeChef;

import java.io.*;
import java.util.*;

public class DISCHAR {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			String s = sc.next();
			Set<Character> k = new HashSet<Character>();
			for (int h = 0; h < s.length(); h++) {
				k.add(s.charAt(h));
			}
			log.write((k.size())+"\n");
		}
		log.flush();
	}
}
