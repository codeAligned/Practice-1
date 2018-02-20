package hackerrank.algorithms.implementation;

// https://www.hackerrank.com/challenges/day-of-the-programmer/problem

import java.util.Scanner;

public class DayOfTheProgrammer {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%4!=0 && n!=1918)
            System.out.println("13.09."+n);
        else if(n%4==0){
            if(n<1918)
                System.out.println("12.09."+n);
            else if(n%400==0 || (n%4==0 && n%100!=0))
                System.out.println("12.09."+n);
            else
                System.out.println("13.09."+n);
        }
        else if(n==1918)
            System.out.println("26.09."+n);
        else
            System.out.println("13.09."+n);
        sc.close();
    }
}
