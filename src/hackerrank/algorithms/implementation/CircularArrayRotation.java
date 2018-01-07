package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class CircularArrayRotation {
    //public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // int m[] = new int[q];
        for (int i = 0; i < q; i++) {
            int m = sc.nextInt();
            System.out.println(a[(n - (k % n) + m) % n]);
        }
        sc.close();
    }
}
