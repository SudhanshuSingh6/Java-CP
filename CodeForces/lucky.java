package CodeForces;

import java.util.*;
public class lucky {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int s =n;
	int c=0;
	int m=0;
	int r1 = 7;
	int r2 = 4;
	while(s!=0)
	{
		s = s/10;
		c++;
	}
	for(int i=1;i<=c;i++)
	{
		if(n%r1==0) {
			m=1;
			break;
		}
		if(n%r2==0) {
			m=1;
			break;
		}
		r1 = r1*10 + 4;
		r2 = r2*10 + 7;
	}
	if(m==1)
		System.out.println("YES");
	else
		System.out.println("NO");
}
}
