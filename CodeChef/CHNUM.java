package CodeChef;
import java.util.*;
public class CHNUM {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int c=1;
            for(int i=0;i<n-1;i++)
            {
                if(arr[i]==arr[i+1])
                {
                    c++;
                    if(i==n-2)
                        System.out.println(c);
                }
                else
                {
                    System.out.println(c);
                    c=1;
                    if(i==n-2)
                        System.out.println(c);
                }
            }
        }
    }
}
