package hackerrank.tutorials.ctci;

import java.util.HashMap;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/ctci-ransom-note/problem

public class RansomNote {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if (n > m)
            System.out.println("No");
        else {
            boolean flag = true;
            HashMap<String, Integer> magazine = new HashMap<>();
            for (int i = 0; i < m; i++) {
                String s = sc.next();
                if (magazine.containsKey(s)) {
                    int x = magazine.get(s);
                    magazine.put(s, x + 1);
                } else {
                    magazine.put(s, 1);
                }
            }
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                if(!magazine.containsKey(s)){
                    flag = false;
                    break;
                }
                else {
                    int x = magazine.get(s);
                    if(x>1)
                        magazine.put(s, x - 1);
                    else
                        magazine.remove(s);
                }
            }
            if(flag)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        sc.close();

    }
}
