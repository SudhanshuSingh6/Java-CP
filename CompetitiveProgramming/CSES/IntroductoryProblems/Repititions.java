package CompetitiveProgramming.CSES.IntroductoryProblems;
import java.util.*;
public class Repititions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int c = 1;
		int m = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				c++;
			} else {
				c = 1;
			}
			m = Math.max(m, c);
		}
		m = Math.max(c, m);
		System.out.println(m);
		sc.close();
	}
}
