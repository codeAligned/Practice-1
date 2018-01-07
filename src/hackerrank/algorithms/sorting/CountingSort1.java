package hackerrank.algorithms.sorting;

import java.util.Scanner;

public class CountingSort1 {
    //public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int count[] = new int[100];
        for (int i = 0; i < 100; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            count[a[i]]++;
        }
        for (int i = 0; i < 100; i++) {
            System.out.print(count[i] + " ");
        }
    }
}
