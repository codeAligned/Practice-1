package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class ChocolateFeast {
    //public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            t--;
            int n = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();
            int count = n / c;
            int wrap = count;
            while (wrap >= m) {
                count = count + wrap / m;
                wrap = wrap / m + wrap % m;
                //System.out.println(wrap);
            }
            System.out.println(count);
        }
        sc.close();
    }
}
