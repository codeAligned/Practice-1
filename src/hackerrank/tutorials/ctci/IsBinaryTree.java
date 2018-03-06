package hackerrank.tutorials.ctci;

// https://www.hackerrank.com/challenges/ctci-is-binary-search-tree/problem

public class IsBinaryTree {
    class Node {
        int data;
        Node left;
        Node right;
    }

    boolean checkBST(Node root){
        return check(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean check(Node root, int min, int max){
        if(root==null)
            return true;
        else if(root.data<=min || root.data>=max)
            return false;
        else if(root.data>min && root.data<max)
            return check(root.left, min, root.data) && check(root.right, root.data, max);
        return false;
    }
}
