package Recursion;

public class a {
    static int fun1(int n) {
        System.out.println(n);
        if (n == 1) {
            System.out.println(0 + " " + n);
            return 0;
        } else {
            int c = 1 + fun1(n / 2);
            int d = c - 1;
            System.out.println(c + " " + d + " " + n);
            return c;
        }
    }
    public static void main(String[] args) {
        System.out.println(fun1(8));
    }
}
