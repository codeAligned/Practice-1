package hackerrank.algorithms.strings;

import java.util.Scanner;

public class MarsExploration {
    //public class Solution{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int count=0;
        for(int i=0;i<S.length();i++){
            if(i%3==0 || i%3==2){
                if(S.charAt(i)!='S'){
                    count++;
                }
            }
            else if(i%3==1){
                if(S.charAt(i)!='O'){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
