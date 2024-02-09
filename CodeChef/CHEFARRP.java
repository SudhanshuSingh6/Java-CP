package CodeChef;
import java.util.*;
public class CHEFARRP {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n =sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i] =sc.nextInt();
            int m=1;
            int k=0;
            int c=0;
            for(int i=0;i<n;i++)
            {
                for(int j=i;j<n;j++)
                {
                    m=m*arr[j];
                    k=k+arr[j];
                    if(m==k)
                        c++;
                }
                m=1;
                k=0;
            }
            System.out.println(c);
        }
    }
}
