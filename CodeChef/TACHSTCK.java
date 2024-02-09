package CodeChef;

import java.util.*;

public class TACHSTCK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long d = sc.nextLong();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		int c = 0;
		Arrays.sort(arr);
		for (int i = 0; i < n - 1;) {
			if (arr[i + 1] - arr[i] <= d && (arr[i + 1] != 0 && arr[i] != 0)) {
				c++;
				arr[i + 1] = 0;
				arr[i] = 0;
				i=i+2;
			} else {
				i++;
			}
		}
		System.out.println(c);
	}
}