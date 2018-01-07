package hackerrank.algorithms.sorting;

import java.util.Scanner;

public class InsertionSort1 {
    //public class Solution{
    public static void insertIntoSorted(int[] ar) {
        int n = ar.length;
        int newInt = ar[n - 1];
        boolean flag = false;
        for (int i = n - 2; i >= 0; i--) {
            if (ar[i] > newInt) {
                ar[i + 1] = ar[i];
            } else {
                ar[i + 1] = newInt;
                flag = true;
            }
            printArray(ar);
            if (flag) {
                break;
            }
        }
        if (flag == false) {
            ar[0] = newInt;
            printArray(ar);
        }
    }


    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
