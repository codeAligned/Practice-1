package hackerrank.tutorials.ctci;

// https://www.hackerrank.com/challenges/ctci-making-anagrams/problem

import java.util.HashMap;
import java.util.Scanner;

public class MakingAnagrams {
    public static void main(String args[]) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();
        int total = s.length() + s1.length();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int num = map.get(s.charAt(i));
                map.put(s.charAt(i), num + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < s1.length(); i++) {
            if (!(map.containsKey(s1.charAt(i)))) {
                //total = total -2;
            } else {
                if (map.get(s1.charAt(i)) > 1) {
                    int num = map.get(s1.charAt(i));
                    map.put(s1.charAt(i), num - 1);
                } else if (map.get(s1.charAt(i)) == 1) {
                    map.remove(s1.charAt(i));
                }
                total = total - 2;
            }
        }
        System.out.println(total);
        sc.close();

    }
}
