package HackerRank;
import java.util.*;
public class GoodlandElectricity {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int a = n/(k);
        if(n%2!=0)
            a++;
        int c =0;
        for(int i=k-1;i<n;i=i+k)
        {
            if(arr[i]==1)
            {
                c++;
            }
        }
        if(c>=a)
            System.out.println(a);
        else
            System.out.println(-1+" "+c);
    }
}
