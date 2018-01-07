package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class MigratoryBirds {
    //public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        int[] counts = new int[6];
        for (int types_i = 0; types_i < n; types_i++) {
            types[types_i] = in.nextInt();
            counts[types[types_i]]++;
        }
        int max = 0;
        int ans = 0;
        for (int i = 1; i < 6; i++) {
            if (counts[i] > max) {
                max = counts[i];
                ans = i;
            }
        }
        System.out.println(ans);
        in.close();
    }
}
