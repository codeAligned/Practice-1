package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class UtopianTree {
    //public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            t--;
            int n = sc.nextInt();
            int val = 1;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    val = val * 2;
                } else {
                    val = val + 1;
                }
            }
            System.out.println(val);
        }
        sc.close();
    }
}
