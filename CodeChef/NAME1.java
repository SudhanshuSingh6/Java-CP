package CodeChef;

import java.io.*;

public class NAME1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int x = 0; x < t; x++) {
			String s = br.readLine();
			int[] aa = new int[26];
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				if (c >= 'a' && c <= 'z')
					aa[c - 'a']++;
			}
			int n = Integer.parseInt(br.readLine());
			boolean enough = true;
			for (int i = 0; i < n; i++) {
				s = br.readLine();
				if (!enough)
					continue;
				for (int j = 0; j < s.length(); j++) {
					char c = s.charAt(j);
					if (c >= 'a' && c <= 'z' && --aa[c - 'a'] < 0) {
						enough = false;
						break;
					}
				}
			}
			System.out.println(enough ? "YES" : "NO");
		}
	}
}
