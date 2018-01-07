package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class GradingStudents {
    //public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int a0 = 0; a0 < n; a0++) {
            int grade = in.nextInt();
            if (grade >= 38) {
                int x = grade / 5;
                //System.out.println("x : "+x);
                if (((x + 1) * 5 - grade) < 3) {
                    grade = (x + 1) * 5;
                }
            }
            System.out.println(grade);
        }
        in.close();
    }
}
