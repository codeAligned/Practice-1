package hackerrank.algorithms.strings;

//https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem

import java.util.Scanner;

public class HackerrankInAString {
    private static boolean isSubsequenceHR(String s) {
        String str = "hackerrank";
        int i = 0;
        int j = 0;
        while (i < str.length()) {
            while (j < s.length()) {
                if (str.charAt(i) == s.charAt(j)) {
                    i++;
                    j++;
                } else
                    j++;
                if(i == str.length())
                    break;
            }
            break;
        }
        //System.out.println(i);
        //System.out.println(j);
        if (i == str.length())
            return true;
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q > 0) {
            q--;
            String s = sc.next();
            boolean flag = isSubsequenceHR(s);
            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
