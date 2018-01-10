package geeksforgeeks.amazon;

// https://www.geeksforgeeks.org/check-array-contains-contiguous-integers-duplicates-allowed/

import java.util.Arrays;
import java.util.Scanner;

public class Two {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        boolean flag = true;
        for (int i = 1; i < n; i++)
            if ((a[i] - a[i - 1]) > 1)
                flag = false;
        if (flag)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}
