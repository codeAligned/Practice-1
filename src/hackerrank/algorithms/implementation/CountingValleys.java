package hackerrank.algorithms.implementation;

// https://www.hackerrank.com/challenges/counting-valleys/problem

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountingValleys {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String steps = sc.next();
        List<Integer> alt = new ArrayList<Integer>();
        alt.add(0);
        for (int i = 0; i < n; i++)
            if (steps.charAt(i) == 'U')
                alt.add(alt.get(i) + 1);
            else if (steps.charAt(i) == 'D')
                alt.add(alt.get(i) - 1);
        alt.add(0);
        int count =0;
        boolean belowSea = false;
        for(int i=0;i<alt.size();i++) {
            if (alt.get(i) == -1)
                belowSea = true;
            if (alt.get(i) == 0 && belowSea == true) {
                count++;
                belowSea = false;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
