package HaackerEarth;

import java.util.*;
public class GoldenRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 0;
		for (int t = 0; t < n; t++) {
			double a = sc.nextInt();
			double b = sc.nextInt();
			double ratio;
			if (a > b) {
				ratio = a / b;
				if (ratio >= 1.6 && ratio <= 1.7) {
					c = c + 1;
				}
			} else {
				ratio = b / a;
				if (ratio >= 1.6 && ratio <= 1.7) {
					c = c + 1;
				}
			}
		}
		System.out.println(c);
		sc.close();
	}
}