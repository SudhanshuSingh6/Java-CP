package HaackerEarth;
import java.util.*;
public class SquareTransaction {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		boolean flag;
		for(int t=0;t<k;t++)
		{
			flag = true;
			int s = sc.nextInt();
            for(int i = 0; i<n; i++){
                s -= arr[i];
                if(s <= 0){
                    System.out.println(i+1);
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("-1");
            }
        }
    }
}
