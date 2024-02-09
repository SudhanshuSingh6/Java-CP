package CodeChef;
import java.util.*;
public class MGCSET {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n =sc.nextInt();
            int m =sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            int c=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]%m==0)
                    c++;
            }
            System.out.println((long)Math.pow(2,c)-1);
        }
    }
}
