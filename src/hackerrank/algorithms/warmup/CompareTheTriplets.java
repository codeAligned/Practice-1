package hackerrank.algorithms.warmup;

import java.util.Scanner;

public class CompareTheTriplets {
    //public class Solution
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        int b[] = new int[3];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
        b[0] = sc.nextInt();
        b[1] = sc.nextInt();
        b[2] = sc.nextInt();
        int a0 = 0;
        int b0 = 0;
        if (a[0] > b[0])
            a0++;
        if (b[0] > a[0])
            b0++;
        if (a[1] > b[1])
            a0++;
        if (b[1] > a[1])
            b0++;
        if (a[2] > b[2])
            a0++;
        if (b[2] > a[2])
            b0++;
        System.out.print(a0+" "+b0);
        sc.close();
    }
}
