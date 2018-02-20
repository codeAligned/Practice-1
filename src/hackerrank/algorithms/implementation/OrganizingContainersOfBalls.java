package hackerrank.algorithms.implementation;

// https://www.hackerrank.com/challenges/organizing-containers-of-balls/problem

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrganizingContainersOfBalls {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q > 0) {
            q--;
            int n = sc.nextInt();
            int a[][] = new int[n][];
            List<Integer> balls = new ArrayList<Integer>();
            List<Integer> containers = new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                a[i]=new int[n];
                for(int j=0;j<n;j++)
                    a[i][j]=sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                int rowSum = 0;
                int colSum = 0;
                for (int j = 0; j < n; j++) {
                    rowSum += a[i][j];
                    colSum += a[j][i];
                }
                balls.add(colSum);
                containers.add(rowSum);
            }
            containers.removeAll(balls);
            if(containers.isEmpty())
                System.out.println("Possible");
            else
                System.out.println("Impossible");

        }
        sc.close();

    }
}
