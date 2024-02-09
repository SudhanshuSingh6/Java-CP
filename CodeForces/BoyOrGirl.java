package CodeForces;
import java.util.*;
public class BoyOrGirl {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Character r[] = new Character[s.length()];
		for(int i=0;i<s.length();i++)
		{
			r[i] = s.charAt(i);
		}
		Set<Character> p = new HashSet<>();
		Collections.addAll(p, r);
		if(p.size()%2==0)
		{
			System.out.println("CHAT WITH HER!");
		}
		else
			System.out.println("IGNORE HIM!");
	}
}
