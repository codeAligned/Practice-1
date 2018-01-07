package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class ServiceLane {
    //public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int width[] = new int[n];
        for (int i = 0; i < n; i++) {
            width[i] = sc.nextInt();
        }
        while (t != 0) {
            t--;
            int type = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int i = x; i <= y; i++) {
                if (width[i] == 1) {
                    type = 1;
                    break;
                } else if (width[i] == 2) {
                    type = 2;
                } else if (width[i] == 3 && (type == 3 || type == 0)) {
                    type = 3;
                }
            }
            System.out.println(type);
        }
        sc.close();
    }
}
