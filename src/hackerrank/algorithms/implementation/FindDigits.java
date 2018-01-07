package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class FindDigits {
    //public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            t--;
            int n = sc.nextInt();
            int m = n;
            int count = 0;
            while (m != 0) {
                int x = m % 10;
                if (x != 0) {
                    if (n % x == 0) {
                        count++;
                    }
                }
                m = m / 10;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
