package hackerrank.algorithms.warmup;

import java.util.Scanner;

public class BirthdayCakeCandles {
//public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int max = sc.nextInt();
        a[0] = max;
        for (int i = 1; i < n; i++) {
            a[i] = sc.nextInt();
            if (max < a[i])
                max = a[i];
        }
        int count = 0;
        for (int i = 0; i < n; i++)
            if (max == a[i])
                count++;
        System.out.println(count);
    }
}

