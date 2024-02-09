package CodeChef;

import java.util.*;

public class adamat1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		for (int p = 0; p < f; p++) {
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			int[][] cr = new int[n][n];
			int[][] crr = new int[n][n];
			int m = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
					cr[i][j] = ++m;
					crr[i][j] = arr[i][j];
				}
			}
			int temp = 0;
			for (int i = 0; i < n; i++) {
				for (int j = n - 1; j >= 0; j--) {
					if (cr[i][j] != arr[i][j]) {
						temp++;
						for (int a = i; a <= j; a++) {
							for (int b = i; b <= j; b++) {
								arr[a][b] = crr[b][a];
							}
						}
						for (int v = 0; v < n; v++) {
							for (int x = 0; x < n; x++) {
								crr[v][x] = arr[v][x];
							}
						}
					}
				}
			}
			System.out.println(temp);
			temp = 0;
		}
	}
}
