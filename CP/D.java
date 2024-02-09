package CP;

import java.util.*;

public class D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int amt = sc.nextInt();
		int[] arr = new int[amt + 1];
		int[] in = new int[n];
		for (int i = 0; i < n; i++) {
			in[i] = sc.nextInt();
			arr[in[i]] = 1;
		}
		arr[0] = 1;
		for (int i = 0; i < n; i++) {
			int x = in[i];
			while (x + in[i] <= amt) {
				int k = x + in[i];
				if (arr[k] == 0)
					arr[k] = arr[x]++;
				else
					arr[k] = Math.min(arr[k], arr[x] + 1);
				x = x + in[i];
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
