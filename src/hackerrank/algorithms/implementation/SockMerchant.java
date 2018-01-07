package hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class SockMerchant {
    //public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> socks = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (socks.containsKey(a)) {
                socks.put(a, socks.get(a) + 1);
            } else {
                socks.put(a, 1);
            }
        }
        Iterator<Integer> it = socks.keySet().iterator();
        int count = 0;
        while (it.hasNext()) {
            count += socks.get(it.next()) / 2;
        }
        System.out.println(count);
        sc.close();
    }
}
