package hackerrank.algorithms.strings;

import java.util.Scanner;

public class MakingAnagrams {
    //public class Solution{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        char s1[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        char s2[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < a.length(); i++) {
            s1[a.charAt(i) - 97]++;
        }
        for (int i = 0; i < b.length(); i++) {
            s2[b.charAt(i) - 97]++;
        }
        int diff = 0;
        for (int i = 0; i < 26; i++) {
            diff = diff + Math.abs(s1[i] - s2[i]);
        }
        System.out.println(diff);
    }
}
