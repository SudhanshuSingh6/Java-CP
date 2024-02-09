package HaackerEarth;
import java.util.*;
import java.util.regex.*;
public class MannasFirstName {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String s = sc.next();
			String k ="";
			int c =0;
			int m=0;
			if(s.contains("SUVOJIT")==true)
			{
				Pattern pattern = Pattern.compile("SUVOJIT");
				Matcher matcher = pattern.matcher(s);
				while (matcher.find()) {
				    c++;
				}
				s = s.replace("SUVOJIT", "1");
			}
			if(s.contains("SUVO")==true)
			{
				Pattern pattern = Pattern.compile("SUVO");
				Matcher matcher = pattern.matcher(s);
				while (matcher.find()) {
				    m++;
				}
			}
			System.out.println("SUVO = "+m+", "+"SUVOJIT = "+c);
			
		}
	}
}