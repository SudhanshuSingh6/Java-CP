package CodeChef;
import java.util.*;
public class CSUM {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n =sc.nextInt();
            int m =sc.nextInt();
            List<Long> arr = new ArrayList();
            for(int i=0;i<n;i++)
                arr.add(sc.nextLong());
            int f=0;
            Collections.sort(arr);
            for(int i=0;i<n;i++)
            {
                long a = Math.abs(arr.get(i)-m);
                int k = Collections.binarySearch(arr, a);
                if(k>=0&&arr.get(i)+arr.get(k)==m&&i!=k)
                {
                    System.out.println("Yes");
                    f=1;
                    break;
                }
            }   
            if(f==0)
                System.out.println("No");
        }
    }
}
