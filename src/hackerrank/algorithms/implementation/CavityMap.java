package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class CavityMap {
    //public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][];
        for (int i = 0; i < n; i++) {
            String x = sc.next();
            a[i] = new int[n];
            for (int j = 0; j < n; j++) {
                a[i][j] = Character.getNumericValue(x.charAt(j));
            }
        }
        for (int i = 1; i < (n - 1); i++) {
            for (int j = 1; j < (n - 1); j++) {
                if (a[i][j] > a[i - 1][j] && a[i][j] > a[i][j - 1] && a[i][j] > a[i + 1][j] && a[i][j] > a[i][j + 1]
                        && a[i - 1][j] != -1 && a[i][j - 1] != -1 && a[i + 1][j] != -1 && a[i][j + 1] != -1) {
                    a[i][j] = -1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] != -1 ? a[i][j] : "X");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
