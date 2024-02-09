package CodeChef;

import java.util.*;

public class CODSTAN7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if (k % 4 == 1||k%4==2) {
            System.out.println("John");
        } else {
            System.out.println("Ravi");
        }
    }
}
