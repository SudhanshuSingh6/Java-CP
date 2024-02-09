package CompetitiveProgramming.CSES.IntroductoryProblems;
import java.util.*;
public class MissingNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long s = 0;
		long s1 = 0;
		for (int i = 0; i < n - 1; i++) {
			long a = sc.nextInt();
			s1 = s1 + a;
		}
		s = (n * (n + 1)) / 2;
		System.out.print(s - s1);
		sc.close();
	}
}
