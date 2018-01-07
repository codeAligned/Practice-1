package hackerrank.algorithms.strings;

import java.util.Scanner;

public class Gemstones {
    //public class Solution{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] counts = new int[n][];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            counts[i] = new int[26];
            for (int j = 0; j < 26; j++) {
                counts[i][j] = 0;
            }
            for (int j = 0; j < s.length(); j++) {
                counts[i][s.charAt(j) - 97]++;
            }
        }

        int abc = 0;
        for (int i = 0; i < 26; i++) {
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if (counts[j][i] == 0) {
                    flag = true;
                }
            }
            if (!flag) {
                abc++;
            }
        }
        System.out.println(abc);
    }
}
