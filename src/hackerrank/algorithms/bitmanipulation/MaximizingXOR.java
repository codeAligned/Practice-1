package hackerrank.algorithms.bitmanipulation;

import java.util.Scanner;

public class MaximizingXOR {
    //public class Solution {
    /*
     * Complete the function below.
     */

    static int maxXor(int l, int r) {
        int q = l ^ r, a = 1;
        while (q != 0) {
            q /= 2;
            a <<= 1;
        }
        return --a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());

        int _r;
        _r = Integer.parseInt(in.nextLine());

        res = maxXor(_l, _r);
        System.out.println(res);

    }
}
