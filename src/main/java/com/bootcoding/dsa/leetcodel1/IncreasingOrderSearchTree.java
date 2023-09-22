package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-897 WAP for increasing order search Tree, rearrange the tree in in-order
public class IncreasingOrderSearchTree {
    public static void main(String[] args) {
        //Creating root node and assign value to it
        TreeNode root = new TreeNode(10);
        //Creating root.left node and assign value to it
        root.left = new TreeNode(5);
        //Creating root.right node and assign value to it
        root.right = new TreeNode(15);
        //Creating root.left.left node and assign value to it
        root.left.left = new TreeNode(3);
        //Creating root.left.right node and assign value to it
        root.left.right = new TreeNode(7);
        //Creating root.right.left node and assign value to it
        root.right.left = new TreeNode(12);
        //Creating root.right.right node and assign value to it
        root.right.right = new TreeNode(17);
        //Creating object for IncreasingOrderSearchTreeSolution
        IncreasingOrderSearchTreeSolution increasingOrderSearchTreeSolution = new IncreasingOrderSearchTreeSolution();
        //Method calling, method return Tree in increasing order
        TreeNode IncreasingOrderTree = increasingOrderSearchTreeSolution.increasingBST(root);
        //display tree data in inOrder manner
        inOrder(IncreasingOrderTree);
    }
    //Method to print tree node value in inOrder manner
    public static void inOrder(TreeNode invertedTree){
        if(invertedTree == null) return;//Termination condition

        inOrder(invertedTree.left);//Recursion to print left of node
        System.out.println(invertedTree.val);//Middle print root
        inOrder(invertedTree.right);//Recursion to print right of node
    }
}
//This class representation each tree node itself
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    public TreeNode(int val) {
//        this.val = val;
//        this.left = null;
//        this.right = null;
//    }
//}

//Class containing all logic to invert the tree
class IncreasingOrderSearchTreeSolution {
    TreeNode current;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode newRoot = new TreeNode(0);
        current = newRoot;
        inorderBST(root);
        return newRoot.right;
    }
    private void inorderBST(TreeNode node){
        if(node == null){
            return;
        }
        inorderBST(node.left);
        node.left = null;
        current.right = node;
        current = node;
        inorderBST(node.right);
    }
}

