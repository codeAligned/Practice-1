package hackerrank.tutorials.ctci;

public class LinkedListCycle {
    //A Node is defined as:
    class Node {
        int data;
        Node next;
    }

    boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while(slow!=null && fast!=null){
            slow = slow.next;
            if(fast.next!=null)
                fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }
}
