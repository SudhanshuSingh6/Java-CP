package CompetitiveProgramming.CSES.SortingAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class RestaurantCustomers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] input;
		Map<Integer, Integer> map = new TreeMap<>();
		while (n-- > 0) {
			input = br.readLine().split(" ");
			map.put(Integer.parseInt(input[0]), 1);
			map.put(Integer.parseInt(input[1]), -1);
		}
		int ans = 0;
		int c = 0;
		for (Map.Entry<Integer, Integer> i : map.entrySet()) {
			c += i.getValue();
			if (ans < c)
				ans = c;
		}
		System.out.println(ans);
	}
}
