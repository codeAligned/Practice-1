package hackerrank.algorithms.sorting;

import java.util.Scanner;

public class InsertionSort2 {
    //public class Solution{
    public static void insertionSortPart2(int[] ar) {
        int n = ar.length;
        for (int j = 1; j < n; j++) {
            int key = ar[j];
            int i = j - 1;
            while ((i > -1) && (ar[i] > key)) {
                ar[i + 1] = ar[i];
                i--;
            }
            ar[i + 1] = key;
            printArray(ar);
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertionSortPart2(ar);

    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
