package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class Kangaroo {
    //public class Solution{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        if (time.endsWith("AM") && time.startsWith("12")) {
            time = time.substring(2, time.length() - 2);
            time = "00" + time;
        } else if (time.endsWith("AM") || (time.endsWith("PM") && time.startsWith("12"))) {
            time = time.substring(0, time.length() - 2);
        } else {
            time = time.substring(0, time.length() - 2);
            char first = time.charAt(0);
            char second = time.charAt(1);
            int val = (first - 48) * 10 + (second - 48);
            val = val + 12;
            //System.out.println(val);
            first = (char) ((val / 10) + 48);
            second = (char) ((val % 10) + 48);
            //System.out.println(first);
            //System.out.println(second);
            time = time.substring(2);
            time = String.valueOf(first) + String.valueOf(second) + time;
        }
        System.out.println(time);
        sc.close();
    }
}
