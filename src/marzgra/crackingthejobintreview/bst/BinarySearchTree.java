/*
TASK:
Given the root node of a binary tree, can you determine if it's also a binary search tree?

 */
package marzgra.crackingthejobintreview.bst;

public class BinarySearchTree {
    private Node prev = null;
    private boolean checkBST(Node node){
        // traverse the tree in order
        if(node != null){
            if(!checkBST(node.left)) return false;
            if(prev != null && node.data <= prev.data) return false;
            prev = node;
            return checkBST(node.right);
        }
        return true;
    }

}
