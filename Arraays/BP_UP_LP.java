package Arraays;

public class BP_UP_LP {
	static int lowerBound(Long ar[], double L){
		int len=ar.length;
        int strt=0,  end =len;
        while (strt<end ){
            int mid=(strt+end)/2;
            
            if (ar[mid]>=L) end =mid;
            else strt=mid+1;
        }
        return strt;
        
    }
	static int upperBound(Long ar[], double  L){
		int len=ar.length;
        int strt=0,  end = len;
        while (strt<end){
            int mid=(strt+end)/2;
            if(ar[mid]<=L) strt=mid+1;
            else end =mid;
        }
        return strt;
    }
}
