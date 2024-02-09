package CodeChef;

import java.util.*;

public class PTUPLES {
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = 1000001;
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=i;
        }
        arr[1]=0;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(arr[i]!=0)
            {
            for(int j=i*i;j<n;j=j+i)
            {
                arr[j] =0;
            }
            }
        }
        int[] ar1 = new int[n];
        int h=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                ar1[h]=arr[i];
                h++;
            }
        }
        int t = sc.nextInt();
        for(int x=0;x<t;x++)
        {
        int k = sc.nextInt();
        int g =0;
        for(int i=1;i<n-1;i++)
        {
        	if(ar1[i+1]<=k)
        	{
        		if(ar1[i+1]-ar1[i]==2)
        		{
        			g++;
        		}
        	}
        }
        System.out.println(g);
        }
    }
}