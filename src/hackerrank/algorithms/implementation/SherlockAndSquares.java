package hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class SherlockAndSquares {
    //public class Solution{
    public static void main(String args[]) {
        ArrayList<Integer> squares = new ArrayList<Integer>();
        int square = 0;
        int root = 0;
        while (square <= 1000000000) {
            squares.add(square);
            root = root + 1;
            square = root * root;
            // System.out.println(square);
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            t--;
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int count = 0;
            for (int i = 0; i < squares.size(); i++) {
                if (squares.get(i) >= n1 && squares.get(i) <= n2) {
                    count++;
                }
                if (squares.get(i) > n2) {
                    break;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
