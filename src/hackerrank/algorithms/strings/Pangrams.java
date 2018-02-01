package hackerrank.algorithms.strings;

// https://www.hackerrank.com/challenges/pangrams/problem

import java.util.Scanner;

public class Pangrams {
    private static boolean isPanagram(String s) {
        s = s.replaceAll("\\s", "");
        s = s.toUpperCase();
        boolean flags[] = new boolean[26];
        if(s.length()<26)
            return false;
        for(int i=0;i<s.length();i++)
            flags[((int)s.charAt(i))-65]=true;
        for(int i=0;i<26;i++)
            if(!flags[i])
                return false;
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean flag = isPanagram(s);
        if(flag)
            System.out.println("pangram");
        else
            System.out.println("not pangram");
        sc.close();

    }
}
