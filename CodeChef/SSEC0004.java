
package CodeChef;
import java.util.*;
public class SSEC0004 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> arr = new ArrayList<String>();
        for(int i=0;i<n;i++)
        {
            arr.add(sc.next());
        }
         Collections.sort(arr);
         for(int i=0;i<n;i++)
         System.out.println(arr.get(i));
    }
}
