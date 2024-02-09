package CodeChef;
import java.util.*;
public class IARANK {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            int c=1;
            for(int j=i;j>=0;j--)
            {
                if(arr[i]<arr[j])
                    c++;
            }
            System.out.println(c);
        }
    }
}
