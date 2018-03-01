package hackerrank.algorithms.implementation;

// https://www.hackerrank.com/challenges/electronics-shop/problem

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ElectronicsShop {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int keyboards[] = new int[n];
        int usbs[] = new int[m];
        for (int i = 0; i < n; i++)
            keyboards[i] = sc.nextInt();
        for (int i = 0; i < m; i++)
            usbs[i] = sc.nextInt();
        Arrays.sort(keyboards);
        Arrays.sort(usbs);
        int merged[] = new int[n + m];
        int x = 0;
        int y = 0;
        boolean isKeyboard[] = new boolean[n + m];
        for (int i = 0; i < (n + m); i++) {
            if (keyboards[x] <= usbs[y]) {
                merged[i] = keyboards[x];
                x++;
                isKeyboard[i] = true;
            } else {
                merged[i] = usbs[y];
                y++;
            }
        }
        
        sc.close();

    }
}
