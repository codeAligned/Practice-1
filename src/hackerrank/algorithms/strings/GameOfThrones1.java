package hackerrank.algorithms.strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class GameOfThrones1 {
    //public class Solution{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = "YES";
        Map<Character, Integer> charCounts = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            if(charCounts.containsKey(s.charAt(i))){
                charCounts.put(s.charAt(i), charCounts.get(s.charAt(i))+1);
            }
            else{
                charCounts.put(s.charAt(i), 1);
            }
        }
        Iterator<Character> it = (charCounts.keySet()).iterator();
        int count = 0;
        while(it.hasNext()){
            Character c = it.next();
            if(charCounts.get(c)%2==1){
                //System.out.println(c);
                count++;
                if(count>1){
                    res = "NO";
                    break;
                }
            }
        }
        System.out.println(res);
        sc.close();
    }
}
