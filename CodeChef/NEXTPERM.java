package CodeChef;
import java.util.*;
public class NEXTPERM {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[][] arr = new int[k][n];
            for(int i=0;i<k;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j] = sc.nextInt();
                }
            }
        }
    }
}uigy