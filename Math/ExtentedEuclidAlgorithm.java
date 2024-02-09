package Math;
import java.util.*;
public class ExtentedEuclidAlgorithm {
	static  int coeff(int a,int b,int x,int y)
	{
		if(b==0)
		{
			x=1;
			y=0;
			return a;
		}
		int x1 =1,y1=1;
		int d = coeff(b,a%b,x1,y1);
		x=y1;
		y = x1-y1*(a/b);
		return d;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x =1;
		int y =1;
		System.out.println(coeff(sc.nextInt(),sc.nextInt(),x,y));
	}
}
