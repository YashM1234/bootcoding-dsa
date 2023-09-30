package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-104 WAP to find the maximum depth of binary tree
public class MaxDepthBinaryTree {
    public static void main(String[] args) {
        //Creating root node and assign value to it
        TreeNode root = new TreeNode(3);
        //Creating root.left node and assign value to it
        root.left = new TreeNode(9);
        //Creating root.right node and assign value to it
        root.right = new TreeNode(20);
        //Creating root.right.left node and assign value to it
        root.right.left = new TreeNode(15);
        //Creating root.right.right node and assign value to it
        root.right.right = new TreeNode(7);
        //Creating object for MaxDepthSolution class which has all logic for to find maximum depth
        MaxDepthSolution maxDepth = new MaxDepthSolution();
        //Method calling, method return minimum depth
        int maximumDepth = maxDepth.maxDepth(root);
        //display maximum depth of tree
        System.out.println(maximumDepth);
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

//Class containing all logic to find maximum depth of binary tree
class MaxDepthSolution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return 1 + Math.max(leftDepth, rightDepth);
    }
}