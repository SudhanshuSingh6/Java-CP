
package MyCodeSchool;
import java.util.*;
public class PairsSumK {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0;i<x;i++)
        {
            int a = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[a];
            for(int j=0;j<a;j++)
            {
                arr[j] = sc.nextInt();
            }
            int c=0;
            for(int j=0;j<a;j++)
            {
                for(int h=j;h<a;h++)
                {
                    if(arr[h]+arr[j]==k)
                        c++;
                }
            }
            System.out.println(c);
        }
    }
}
