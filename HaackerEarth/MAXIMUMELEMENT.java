package HaackerEarth;

import java.util.*;

public class MAXIMUMELEMENT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> a = new Stack();
		int n = sc.nextInt();
		{
			for (int i = 0; i < n; i++) {
				int k = sc.nextInt();
				if (k == 1) {
					a.push(sc.nextInt());
				} else if (k == 2) {
					a.pop();
				} else {
					System.out.println();
				}
			}
		}
	}
}
