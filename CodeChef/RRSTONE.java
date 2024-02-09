package CodeChef;
import java.util.*;
class RRSTONE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Long> arr = new ArrayList<Long>();
		for (int i = 0; i < n; i++) {
			arr.add(sc.nextLong());
		}
		if (k == 0) {
			for (int i = 0; i < n; i++) {
				System.out.print(arr.get(i) + " ");
			}
		} else {
			if (k % 2 == 0) {
				long p = Collections.min(arr);
				for (int j = 0; j < n; j++) {
					System.out.print((arr.get(j) - p) + " ");
				}
			} else if (k % 2 == 1) {
				long p = Collections.max(arr);
				for (int j = 0; j < n; j++) {
					System.out.print((p - arr.get(j)) + " ");
				}
			}
		}
	}
}
