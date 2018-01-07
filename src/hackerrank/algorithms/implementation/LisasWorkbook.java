package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class LisasWorkbook {
    //public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int t[] = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        int count = 0;
        int pageNo = 1;
        for (int i = 0; i < n; i++) {
            // int pages = t[i] / k + (t[i] % k == 0 ? 0 : 1);
            int x = t[i];
            int y = 1;
            int k1 = (x >= k ? k : x);
            //System.out.println("k1 : " + k1);
            while (k1 <= x && y <= x) {
                if (pageNo >= y && pageNo <= k1) {
                    count++;
                }
                y = k1 + 1;
                k1 = (x >= (k1 + k) ? k1 + k : x);
                //System.out.println("k1 : " + k1);
                //System.out.println("y : " + y);
                pageNo++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
