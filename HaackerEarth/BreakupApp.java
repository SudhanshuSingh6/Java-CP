package HaackerEarth;

import java.util.*;

public class BreakupApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str;
		int w21 = 0, w19 = 0;
		for (int i = 0; i < n; i++)
		{
			str = sc.nextLine();
			if (str.contains("G:"))
			{
				if (str.contains("19"))
					w19 += 2;
				if (str.contains("21"))
					w21 += 2;
			}
			if (str.contains("M:")) {
				if (str.contains("19"))
					w19++;
				if (str.contains("21"))
					w21++;
			}
		}
		if (w19 > w21)
			System.out.println("Date");
		else
			System.out.println("No Date");
	}
}