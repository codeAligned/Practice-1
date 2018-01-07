package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class DrawingBook {
    //public class Solution{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int x = (p) / 2;
        int y = (n - p) / 2;
        if (x > y) {
            System.out.println(y);
        } else {
            System.out.println(x);
        }
        in.close();
    }
}
