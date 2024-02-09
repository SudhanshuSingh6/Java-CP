
package CodeChef;
import java.util.*;
public class LONGPALI {
    static boolean ispalin(char[] arr,int l,int r)
    {
        int i=0;
        while(i+l<r-i-1){
            if(arr[i+l] != arr[r-i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String s1 = s.substring(0,1);
        char[] arr = s.toCharArray();
        int max = 1;
        int i=1;
        int j=1;
        while(j<=n)
        {
            for(i=0;i<n-j+1;i++)
            {
                if(ispalin(arr,i,i+j))
                {
                    if(max<j)
                    {
                        max=j;
                        s1=s.substring(i,i+j);
                    }
                }
            }
            j++;
        }
        System.out.println(max);
        System.out.println(s1);
    }
}
