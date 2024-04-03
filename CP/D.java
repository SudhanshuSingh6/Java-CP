package CP;

import java.util.*;

public class D {
	public int findLeastNumOfUniqueInts(int[] arr, int k) {
		Arrays.sort(arr);

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++)
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		ArrayList<Integer> sortedKeys = new ArrayList<>(map.keySet());
		Collections.sort(sortedKeys);
		int cnt = 0;
		for (int i = 0; i < sortedKeys.size(); i++) {
			k -= sortedKeys.get(i);
			if (k < 0)
				break;
			cnt++;
		}
		return sortedKeys.size() - cnt;
	}

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
		sc.close();
	}
}
