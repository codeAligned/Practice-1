package hackerrank.algorithms.warmup;

import java.util.Scanner;

public class Staircase {
    //public class Solution{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        float pos = 0;
        float neg = 0;
        float z = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] > 0) {
                pos += 1;
            } else if (a[i] < 0) {
                neg += 1;
            } else if (a[i] == 0) {
                z += 1;
            }
        }
        System.out.println(pos / n);
        System.out.println(neg / n);
        System.out.println(z / n);
        sc.close();
    }
}
