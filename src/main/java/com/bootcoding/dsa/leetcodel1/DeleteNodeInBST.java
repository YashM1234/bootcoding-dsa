package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-450 WAP to delete a node in a Binary search tree
public class DeleteNodeInBST {
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
        //Create an object of DeleteNodeInBstSolution class
        DeleteNodeInBstSolution deleteNodeInBstSolution = new DeleteNodeInBstSolution();
        //Delete node containing value key = 3
        root = deleteNodeInBstSolution.deleteNode(root, 3);
        //display tree data in inOrder manner
        inOrder(root);
    }

    //Method to print tree node value in inOrder manner
    public static void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);//Recursion to print left of node
            System.out.println(root.val);//Middle print root
            inOrder(root.right);//Recursion to print right of node
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

//Class containing all logic to delete a node in binary search tree
class DeleteNodeInBstSolution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        if(key < root.val){
            root.left = deleteNode(root.left, key);
        }
        else if(key > root.val){
            root.right = deleteNode(root.right, key);
        }
        else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.val = minValue(root.right);
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }
    //Find the minimum value in right's left
    private int minValue(TreeNode root){
        int minVal = root.val;
        while(root.left != null){
            minVal = root.left.val;
            root = root.left;
        }
        return minVal;
    }
}