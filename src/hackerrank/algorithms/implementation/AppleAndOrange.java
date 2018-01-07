package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class AppleAndOrange {
    //public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d;
        int apples = 0;
        int oranges = 0;
        for (int i = 0; i < m; i++) {
            d = sc.nextInt();
            if ((a + d) >= s && (a + d) <= t) {
                apples++;
            }
        }
        for (int i = 0; i < n; i++) {
            d = sc.nextInt();
            if ((b + d) >= s && (b + d) <= t) {
                oranges++;
            }
        }
        System.out.println(apples);
        System.out.println(oranges);
        sc.close();

    }
}
