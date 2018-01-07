package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class AngryProfessor {
    //public class Solution{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            t--;
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] <= 0) {
                    k--;
                }
            }
            if (k <= 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
