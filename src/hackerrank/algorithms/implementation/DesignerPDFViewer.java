package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class DesignerPDFViewer {
    //public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int heights[] = new int[26];
        for (int i = 0; i < 26; i++) {
            heights[i] = sc.nextInt();
        }
        String word = sc.next();
        int max = 0;
        for (int i = 0; i < word.length(); i++) {
            if (max < heights[word.charAt(i) - 97]) {
                max = heights[word.charAt(i) - 97];
            }
        }
        System.out.println(max * word.length());
        sc.close();
    }
}
