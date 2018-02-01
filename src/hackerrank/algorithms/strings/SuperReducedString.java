package hackerrank.algorithms.strings;

//https://www.hackerrank.com/challenges/reduced-string/problem

import java.util.Scanner;

public class SuperReducedString {
    private static String superReducedString(String s) {

        return "";
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = superReducedString(s);
        if (result == "")
            System.out.println("Empty String");
        else
            System.out.println(result);
        sc.close();
    }
}
