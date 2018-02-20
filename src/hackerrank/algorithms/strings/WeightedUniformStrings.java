package hackerrank.algorithms.strings;

// https://www.hackerrank.com/challenges/weighted-uniform-string/problem

import java.util.Scanner;

public class WeightedUniformStrings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        int q[] = new int[n];
        for (int i = 0; i < n; i++)
            q[i] = sc.nextInt();
        int weights[] = new int[s.length()];
        weights[0] = ((int) s.charAt(0)) - 96;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1))
                weights[i] = weights[i - 1] + (((int) s.charAt(i)) - 96);
            else
                weights[i] = ((int) s.charAt(i)) - 96;
        }
        for(int i=0;i<n;i++){
            int query = q[i];
            int j=0;
            for(j=0;j<s.length();j++){
                if(query == weights[j]) {
                    System.out.println("Yes");
                    break;
                }
            }
            if(j==s.length())
                System.out.println("No");
        }
        sc.close();
    }
}
