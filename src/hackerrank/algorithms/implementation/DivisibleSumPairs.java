package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class DivisibleSumPairs {
    //pubic class Solution{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((a[i] + a[j]) % k == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
