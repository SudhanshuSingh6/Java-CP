package HackerRank;

import java.util.*;

public class LargestPermutation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Integer[] arr = new Integer[n];
		int[] ar = new int[n];
		int[] index = new int[n + 1];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			index[arr[i]] = i;
		}
		for (int i = 0; i < n && k > 0; i++) {
			if (arr[i] == n - i) {
				continue;
			}
			arr[index[n - i]] = arr[i];
			index[arr[i]] = index[n - i];
			arr[i] = n - i;
			index[n - i] = i;
			k--;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}