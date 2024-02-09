package CodeChef;
import java.util.*;
public class J7 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int x=0;x<t;x++)
		{
			int p = sc.nextInt();
			int s = sc.nextInt();
			double y=(p-(Math.sqrt(p*p - 24*s)))/12;
            double m=(p+2*(Math.sqrt(p*p - 24*s)))/12;
            double volume=m*y*y;
            System.out.println(volume);
		}
	}
}
