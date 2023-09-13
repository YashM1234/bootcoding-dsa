package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-1038 WAP for Binary Search Tree to Greater Sum Tree
public class BstToGst {
    public static void main(String[] args) {
        //Creating root node and assign value to it
        TreeNode root = new TreeNode(4);
        //Creating root.left node and assign value to it
        root.left = new TreeNode(1);
        //Creating root.right node and assign value to it
        root.right = new TreeNode(6);
        //Creating root.left.left node and assign value to it
        root.left.left = new TreeNode(0);
        //Creating root.left.right node and assign value to it
        root.left.right = new TreeNode(2);
        //Creating root.left.right.right node and assign value to it
        root.left.right.right = new TreeNode(3);
        //Creating root.right.left node and assign value to it
        root.right.left = new TreeNode(5);
        //Creating root.right.right node and assign value to it
        root.right.right = new TreeNode(7);
        //Creating root.right.right.right node and assign value to it
        root.right.right.right = new TreeNode(8);
        //Creating object for BstToGstSolution
        BstToGstSolution bstToGstSolution = new BstToGstSolution();
        //Method calling, method return Greater sum tree
       TreeNode gstRoot = bstToGstSolution.bstToGst(root);
        //display tree data in inOrder manner
        inOrder(gstRoot);
    }
    //Method to print tree node value in inOrder manner
    public static void inOrder(TreeNode gstRoot){
        if(gstRoot != null) {
            inOrder(gstRoot.left);//Recursion to print left of node
            System.out.println(gstRoot.val);//Middle print root
            inOrder(gstRoot.right);//Recursion to print right of node
        }
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

//Class containing all logic to convert BST to Greater Sum Tree
class BstToGstSolution {
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        if(root == null){
            return null;
        }
        root.right = bstToGst(root.right);
        root.val = root.val + sum;
        sum = root.val;
        root.left = bstToGst(root.left);
        return root;
    }
}