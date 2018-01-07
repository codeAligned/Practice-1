package hackerrank.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class CutTheSticks {
    //public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int min = a[0];
        int newMin = 0;
        int count = 1;
        while (min != 0 && count != 0) {
            //System.out.println("Count : "+count);
            //System.out.println("Min : "+min);
            count = 0;
            Boolean flag=false;
            for (int i = 0; i < n; i++) {
                a[i] = a[i] - min;
                if (a[i] >= 0) {
                    count++;
                    if (a[i]>0 && flag==false) {
                        newMin = a[i];
                        flag=true;
                    }
                }
            }
            if (count != 0) {
                System.out.println(count);
            }
            min = newMin;
        }
        sc.close();
    }
}
