package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-111 WAP to find the minimum depth of binary tree
public class MinDepthBinaryTree {
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
        //Creating object for MinDepthSolution class which has all logic for to find minimum depth
        MinDepthSolution minDepth = new MinDepthSolution();
        //Method calling, method return minimum depth
       int minimumDepth = minDepth.minDepth(root);
        //display minimum depth of tree
        System.out.println(minimumDepth);
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

//Class containing all logic to find minimum depth of binary tree
class MinDepthSolution {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null){
            return 1 + minDepth(root.right);
        }
        else if(root.right == null){
            return 1 + minDepth(root.left);
        }
        int minLeft = minDepth(root.left);
        int minRight = minDepth(root.right);
        return 1 + Math.min(minLeft, minRight);
    }
}