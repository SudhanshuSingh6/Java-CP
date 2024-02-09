package HackerRank;

import java.util.*;

public class FlatlandSpaceStations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int maxDistance = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int distance = (arr[i] - arr[i - 1]) / 2;
            if (maxDistance < distance) {
                maxDistance = distance;
            }
        }
        int lastGap = (n - 1) - arr[arr.length - 1];
        System.out.println((lastGap < maxDistance) ? maxDistance : lastGap);
    }
}
jg