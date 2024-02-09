package CodeChef;

import java.util.*;

public class THEATRE {
	public static int max(int a, int b, int c, int d) {

		int max = a;

		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;

		return max;
	}
	public static int meo(int a,int b,int c,int d)
	{
		int l=0;
		if(a==0)
			l++;
		if(b==0)
			l++;
		if(c==0)
			l++;
		if(d==0)
			l++;
		return l;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int z = 0; z < t; z++) {
			int a3 = 0;
			int b3 = 0;
			int c3 = 0;
			int d3 = 0;
			int a6 = 0;
			int b6 = 0;
			int c6 = 0;
			int d6 = 0;
			int a12 = 0;
			int b12 = 0;
			int c12 = 0;
			int d12 = 0;
			int a9 = 0;
			int b9 = 0;
			int c9 = 0;
			int d9 = 0;
			int n = sc.nextInt();
			for (int i = 0; i < n*2; i++) {
				String s = sc.next();
				if (s.equals('A')) {
					int h = sc.nextInt();
					if (h == 3)
						a3++;
					if (h == 6)
						a6++;
					if (h == 9)
						a9++;
					if (h == 12)
						a12++;
				}
				if (s.equals('B')) {
					int h = sc.nextInt();
					if (h == 3)
						b3++;
					if (h == 6)
						b6++;
					if (h == 9)
						b9++;
					if (h == 12)
						b12++;
				}
				if (s.equals('C')) {
					int h = sc.nextInt();
					if (h == 3)
						c3++;
					if (h == 6)
						c6++;
					if (h == 9)
						c9++;
					if (h == 12)
						c12++;
				}
				if (s.equals('D')) {
					int h = sc.nextInt();
					if (h == 3)
						d3++;
					if (h == 6)
						d6++;
					if (h == 9)
						d9++;
					if (h == 12)
						d12++;
				}
			}
			int a = max(a9, a3, a6, a12);
			if (a == a3) {
				b3 = 0;
				c3 = 0;
				d3 = 0;
			}
			if (a == a6) {
				b6 = 0;
				c6 = 0;
				d6 = 0;
			}
			if (a == a9) {
				b9 = 0;
				c9 = 0;
				d9 = 0;
			}
			if (a == a12) {
				b12 = 0;
				c12 = 0;
				d12 = 0;
			}
			int b = max(b9, b3, b6, b12);
			if (b == b3) {
				c3 = 0;
				d3 = 0;
			}
			if (b == b6) {
				c6 = 0;
				d6 = 0;
			}
			if (b == b9) {
				c9 = 0;
				d9 = 0;
			}
			if (b == b12) {
				c12 = 0;
				d12 = 0;
			}
			int c = max(c9, c3, c6, c12);
			if (c == c3)
				d3 = 0;
			if (c == c6)
				d6 = 0;
			if (c == c9)
				d9 = 0;
			if (c == c12)
				d12 = 0;
			int d = max(d9, d3, d6, d12);
			int e = max(a, b, c, d);
			if (e == a)
				a = 0;
			if (e == b)
				b = 0;
			if (e == c)
				b = 0;
			if (e == d)
				d = 0;
			int f = max(a, b, c, d);
			if (f == a)
				a = 0;
			if (f == b)
				b = 0;
			if (f == c)
				b = 0;
			if (f == d)
				d = 0;
			int g = max(a, b, c, d);
			if (g == a)
				a = 0;
			if (g == b)
				b = 0;
			if (g == c)
				b = 0;
			if (g == d)
				d = 0;
			int h = max(a, b, c, d);
			int k = meo(e,f,g,h)*(-100);
			int y = ((e*100)+(f*75)+(g*50)+(h*25))-k;
			System.out.println(y);
		}
	}
}
