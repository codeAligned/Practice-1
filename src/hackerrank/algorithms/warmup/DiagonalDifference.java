package hackerrank.algorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {
    //public class Solution{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][];
        long d1 = 0;
        long d2 = 0;
        for (int i = 0; i < n; i++) {
            a[i] = new int[n];
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                if (i == j) {
                    d1 += a[i][j];
                }
                if (i + j == (n - 1)) {
                    d2 += a[i][j];
                }
            }
        }
        System.out.println(Math.abs(d2 - d1));
        sc.close();
    }
}
