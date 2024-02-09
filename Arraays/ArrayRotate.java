
import java.util.Arrays;
import java.util.*;

class ArrayRotate {

    public static void rightRotateByOne(int[] A) {
        int last = A[A.length - 1];
        for (int i = A.length - 2; i >= 0; i--) {
            A[i + 1] = A[i];
        }
        A[0] = last;
    }

    public static void rightRotate(int[] A, int k) {
        for (int i = 0; i < k; i++) {
            rightRotateByOne(A);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        rightRotate(A, k);
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
