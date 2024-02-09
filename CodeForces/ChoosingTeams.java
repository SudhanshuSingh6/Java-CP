package CodeForces;
import java.util.*;
public class ChoosingTeams {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int c =0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]+k<=5)
            {
                c++;
            }
        }
        System.out.println(c/3);
    }
}
