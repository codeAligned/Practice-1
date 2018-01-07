package hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class ManasaAndStones {
    //public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            t--;
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            int min = (n - 1) * a;
            list.add(min);
            int diff = b - a;
            int i = 1;
            if (diff != 0) {
                while (i < n) {
                    list.add(min + (i * diff));
                    i++;
                }
            }
            for (i = 0; i < list.size(); i++) {
                System.out.print(list.get(i)+" ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
