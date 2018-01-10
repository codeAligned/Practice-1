package geeksforgeeks.amazon;

// https://www.geeksforgeeks.org/closest-numbers-list-unsorted-integers/

import java.util.Arrays;
import java.util.Scanner;

import java.lang.Math;

public class One {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        int minDiff = a[1] - a[0];
        for (int i = 2; i < n; i++)
            minDiff = Math.min(minDiff, a[i] - a[i - 1]);
        String ans = "";
        for (int i = 1; i < n; i++)
            if (minDiff == (a[i] - a[i - 1]))
                ans = ans + "(" + a[i] + "," + a[i - 1] + ")";
        System.out.println(ans);
        sc.close();

    }
}
