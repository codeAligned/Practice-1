package hackerrank.algorithms.strings;

import java.util.Scanner;

public class CaesarCipher {
    //public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();
        char c[] = new char[n];
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                if (Character.isUpperCase(s.charAt(i))) {
                    int code = s.charAt(i) + k % 26;
                    code = code % 90;
                    if (code < 64 && code != 0) {
                        code = code + 64;
                    } else if (code == 0) {
                        code = 90;
                    }

                    c[i] = (char) code;
                } else if (Character.isLowerCase(s.charAt(i))) {
                    int code = s.charAt(i) + k % 26;
                    code = code % 122;
                    if (code < 96 && code != 0) {
                        code = code + 96;
                    } else if (code == 0) {
                        code = 122;
                    }
                    c[i] = (char) code;
                }
            } else {
                c[i] = s.charAt(i);
            }
        }
        s = new String(c);
        System.out.println(s);
        sc.close();
    }
}
