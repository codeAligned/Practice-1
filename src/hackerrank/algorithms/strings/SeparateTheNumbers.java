package hackerrank.algorithms.strings;

// https://www.hackerrank.com/challenges/separate-the-numbers/problem

import java.util.Scanner;

public class SeparateTheNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.next();
        }
        sc.close();
    }
}
