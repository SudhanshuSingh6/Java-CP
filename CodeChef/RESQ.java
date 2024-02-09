package CodeChef;

import java.io.*;
import java.util.*;
public class RESQ {
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = sc.nextInt();
		for(int x=0;x<t;x++)
		{
			int n = sc.nextInt();
			int c=0;
			int m=Integer.MAX_VALUE;
			for(int i=1;i<=Math.floor(Math.sqrt(n));i++)
			{
				if(n%i==0)
				{
					c=Math.abs(i-n/i);
					if(m>c)
						m=c;
				}
			}
			log.write(m+"\n");
		}
		log.flush();
	}
}
