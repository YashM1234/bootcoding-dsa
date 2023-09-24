package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-226 WAP to invert binary tree and return its root
public class InvertBinaryTree {
    public static void main(String[] args) {
        //Creating root node and assign value to it
        TreeNode root = new TreeNode(4);
        //Creating root.left node and assign value to it
        root.left = new TreeNode(2);
        //Creating root.right node and assign value to it
        root.right = new TreeNode(7);
        //Creating root.left.left node and assign value to it
        root.left.left = new TreeNode(1);
        //Creating root.left.right node and assign value to it
        root.left.right = new TreeNode(3);
        //Creating root.right.left node and assign value to it
        root.right.left = new TreeNode(6);
        //Creating root.right.right node and assign value to it
        root.right.right = new TreeNode(9);
        //Creating object for InvertTreeSolution class which has all logic to invert tree
        InvertTreeSolution invertTree = new InvertTreeSolution();
        //Method calling, method return minimum depth
        TreeNode invertedTree = invertTree.invertTree(root);
        //display tree data in inOrder manner
        inOrder(invertedTree);
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
class InvertTreeSolution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}