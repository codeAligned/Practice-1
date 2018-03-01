package hackerrank.compete.universityCodeSprint4;

// https://www.hackerrank.com/contests/university-codesprint-4/challenges/summer-lesson

import java.util.Scanner;

public class SummerLesson {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int b[] = new int[m];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            b[x]++;
        }
        for (int i = 0; i < m; i++)
            System.out.print(b[i] + " ");
        sc.close();

    }
}
