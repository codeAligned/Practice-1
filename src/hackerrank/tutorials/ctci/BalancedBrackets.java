package hackerrank.tutorials.ctci;

import java.util.Scanner;
import java.util.Stack;

// https://www.hackerrank.com/challenges/ctci-balanced-brackets/problem
public class BalancedBrackets {
    static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stack.push(s.charAt(i));
            if(stack.empty() && ((s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')))
                return false;
            if(!stack.empty()){
                if (s.charAt(i) == ')' && stack.peek() == '(')
                    stack.pop();
                if (s.charAt(i) == '}' && stack.peek() == '{')
                    stack.pop();
                if (s.charAt(i) == ']' && stack.peek() == '[')
                    stack.pop();
            }
        }
        if (stack.empty())
            return true;
        return false;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String expression = sc.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
        sc.close();
    }

}

