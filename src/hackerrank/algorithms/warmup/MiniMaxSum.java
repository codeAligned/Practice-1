package hackerrank.algorithms.warmup;

import java.util.Scanner;

public class MiniMaxSum {
    //public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a;
        long max = 0;
        long min = 1000000001;
        long sum = 0;
        for (int i = 0; i < 5; i++) {
            a = sc.nextLong();
            sum += a;
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
        }
        System.out.print(sum - max);
        System.out.println(" " + (sum - min));
        sc.close();
    }
}
