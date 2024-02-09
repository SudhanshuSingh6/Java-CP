package MyCodeSchool;
import java.util.*;
// Other imports go here
  
// Do NOT change the class name
class damn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[m];
            for(int j=0;j<m;j++)
            {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            System.out.println(arr[k-1]);
        }
    }
}
