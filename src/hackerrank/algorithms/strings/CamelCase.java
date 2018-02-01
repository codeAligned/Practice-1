package hackerrank.algorithms.strings;

//https://www.hackerrank.com/challenges/camelcase/problem

import java.util.Scanner;

public class CamelCase {
    private static int countWords(String s) {
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (((int) s.charAt(i)) >= 65 && ((int) s.charAt(i)) <= 90)
                count++;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int words = countWords(s);
        System.out.println(words);
        sc.close();
    }
}
