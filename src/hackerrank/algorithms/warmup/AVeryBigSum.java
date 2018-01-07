package hackerrank.algorithms.warmup;

import java.util.Scanner;

public class AVeryBigSum {

    //public class Solution {
    public static void main(String arrgs[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.println(sum);
        sc.close();
    }
}
