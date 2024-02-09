package HackerRank;
import java.util.*;
public class Xor_Sequence {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int t =0;t<x;t++)
        {
            int  l = sc.nextInt();
            int r = sc.nextInt();
            int c =0;
            for(int i=l;i<=r;i++)
            {
                c=c+c^i;
            }
            System.out.println(c+" "+(3^8));
        }
    }
}
