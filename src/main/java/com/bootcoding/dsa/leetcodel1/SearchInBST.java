package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-700 WAP to search value in a binary search tree
You are given the root of a binary search tree (BST) and an integer val.
Find the node in the BST that the node's value equals val and return the
subtree rooted with that node. If such a node does not exist, return null.
 */
public class SearchInBST {
    public static void main(String[] args) {
    //Creating root node and assign value to it
    TreeNode root = new TreeNode(10);
    //Creating root.left node and assign value to it
    root.left = new TreeNode(5);
    //Creating root.right node and assign value to it
    root.right = new TreeNode(15);
    //Creating root.left.left node and assign value to it
    root.left.left = new TreeNode(1);
    //Creating root.left.right node and assign value to it
    root.left.right = new TreeNode(7);
    //Creating root.right.left node and assign value to it
    root.right.left = new TreeNode(12);
    //Creating root.right.right node and assign value to it
    root.right.right = new TreeNode(17);
    //Creating object for SearchInBSTSolution class which has all logic to search element
    SearchInBSTSolution searchInBSTSolution = new SearchInBSTSolution();
    //Method calling, method return root of subtree
    TreeNode subTree = searchInBSTSolution.searchBST(root, 5);
    //display sub tree in inOrder Manner
        inOrderTraverse(subTree);
    }

    public static void inOrderTraverse(TreeNode subTree){
        if(subTree != null){
            inOrderTraverse(subTree.left);
            System.out.println(subTree.val);
            inOrderTraverse(subTree.right);
        }
    }
}

//Class representing single tree node
//class TreeNode{
//    int val;
//    TreeNode left;
//    TreeNode right;
//    //Constructor
//    public TreeNode(int val){
//        this.val = val;
//        this.left = null;
//        this.right = null;
//    }
//}

//Class containing all logic to search the given element in BST
class SearchInBSTSolution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }
        if(root.val == val){
            return root;
        }
        if(val < root.val){
            root = searchBST(root.left, val);
        }
        else{
            root = searchBST(root.right, val);
        }

        return root;
    }

    //OR

//    public TreeNode searchBST(TreeNode root, int val) {
//        if(root == null || root.val == val){
//            return root;
//        }
//        return val < root.val ? searchBST(root.left, val): searchBST(root.right, val);
//    }
}