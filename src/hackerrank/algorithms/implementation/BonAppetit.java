package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BonAppetit {
    //public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        int totalBill = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            totalBill += a[i];
        }
        int b = sc.nextInt();
        int annaBill = (totalBill - a[k]) / 2;
        if (b == annaBill) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - annaBill);
        }
        sc.close();
    }
}
