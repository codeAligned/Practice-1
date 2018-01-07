package hackerrank.algorithms.dynamicprogramming;

import java.util.Scanner;

public class TheMaximumSubarray {
    //public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            t--;
            int n = sc.nextInt();
            int a[] = new int[n];
            int max_ending_here = 0;
            int max_so_far = 0;
            boolean allNeg = true;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] >= 0)
                    allNeg = false;
            }
            if (allNeg) {
                int max = a[0];
                for (int i = 1; i < n; i++)
                    if (max < a[i])
                        max = a[i];
                System.out.println(max + " " + max);
            } else {
                int allPos = 0;
                for (int i = 0; i < n; i++) {
                    max_ending_here += a[i];
                    if (max_ending_here < 0) {
                        max_ending_here = 0;
                    } else if (max_so_far < max_ending_here) {
                        max_so_far = max_ending_here;
                    }
                    if (a[i] > 0) {
                        allPos += a[i];
                    }
                }
                System.out.println(max_so_far + " " + allPos);
            }
        }
        sc.close();
    }
}
