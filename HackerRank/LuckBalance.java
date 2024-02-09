
package HackerRank;
import java.util.*;

public class LuckBalance {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList();
        int m=0;
        for(int i=0;i<n;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(b==1)
            {
                arr.add(a);
            }
            else
                m=m+a;
        }
        Collections.sort(arr);
        int c = arr.size()-k;
        int p=0;
        for(int i=0;i<arr.size();i++)
        {
            if(i<c)
            {
                p=p+arr.get(i);
            }
            else
            {
                m=m+arr.get(i);
            }
        }
        System.out.println(m-p);
    }
}
