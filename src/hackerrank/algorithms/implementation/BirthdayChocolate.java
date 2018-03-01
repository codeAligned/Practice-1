package hackerrank.algorithms.implementation;

// https://www.hackerrank.com/challenges/the-birthday-bar/problem

import java.util.Scanner;

public class BirthdayChocolate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int d = sc.nextInt();
        int m = sc.nextInt();
        int sumM = 0;
        int start = 0;
        for (int i = 0; i < m; i++)
            sumM += a[i];
        int count = 0;
        if (sumM == d)
            count++;
        for (int i = m; i < n; i++) {
            sumM = sumM + a[i] - a[start];
            start++;
            if (sumM == d)
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}
