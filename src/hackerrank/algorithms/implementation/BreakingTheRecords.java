package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BreakingTheRecords {
    //public class Solution{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        int max = 0, min = 0, countMin = 0, countMax = 0;
        for (int score_i = 0; score_i < n; score_i++) {
            score[score_i] = in.nextInt();
            if (score_i == 0) {
                max = score[score_i];
                min = score[score_i];
            } else {
                if (score[score_i] < min) {
                    countMin++;
                    min = score[score_i];
                } else if (score[score_i] > max) {
                    countMax++;
                    max = score[score_i];
                }
            }
        }
        System.out.println(countMax + " " + countMin);
        in.close();
    }
}
