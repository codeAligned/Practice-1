package hackerrank.algorithms.warmup;

import java.util.*;

//public class Solution {
public class SolveMeFirst {
    static int solveMeFirst(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        in.close();
        System.out.println(sum);
    }
}

