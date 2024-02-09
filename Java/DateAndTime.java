
package Java;
import java.util.*;
class DateAndTime
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
    {
    	a[i]= sc.nextInt();
    }
    int m = sc.nextInt();
    int k =a[m];
    Arrays.sort(a);
    System.out.println(Arrays.binarySearch(a, k));
}
}