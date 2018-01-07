package hackerrank.algorithms.sorting;

import java.util.Scanner;

public class RunningTimeAlgorithms {
    //public class Solution{
    public static int insertionSortPart2(int[] ar) {
        int count = 0;
        int n = ar.length;
        for (int j = 1; j < n; j++) {
            int key = ar[j];
            int i = j - 1;
            while ((i > -1) && (ar[i] > key)) {
                ar[i + 1] = ar[i];
                i--;
                count++;
            }
            ar[i + 1] = key;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        int ans = insertionSortPart2(ar);
        System.out.println(ans);

    }
}
