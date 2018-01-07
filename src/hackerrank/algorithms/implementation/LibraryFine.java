package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class LibraryFine {
    //public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        int y1 = sc.nextInt();
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();
        int y2 = sc.nextInt();
        int fine = 0;
        if (y1 > y2) {
            fine = 10000;
        } else if (y1 == y2) {
            if (m1 > m2) {
                fine = (m1 - m2) * 500;
            } else if (m1 == m2) {
                if (d1 > d2) {
                    fine = (d1 - d2) * 15;
                }
            }
        }
        System.out.println(fine);
        sc.close();
    }

}
