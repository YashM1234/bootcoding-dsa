package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-100 WAP for same tree, if both tree structure and value are same return true
public class SameTree {
    public static void main(String[] args) {

        //Creating tree-1 i.e root1 denoted as p in leetcode
        //Creating root1 node and assign value to it
        TreeNode root1 = new TreeNode(3);
        //Creating root1.left node and assign value to it
        root1.left = new TreeNode(9);
        //Creating root1.right node and assign value to it
        root1.right = new TreeNode(20);
        //Creating root1.right.left node and assign value to it
        root1.right.left = new TreeNode(15);
        //Creating root1.right.right node and assign value to it
        root1.right.right = new TreeNode(7);

        //Creating tree-2 i.e root2 denoted as q in leetcode
        //Creating root2 node and assign value to it
        TreeNode root2 = new TreeNode(3);
        //Creating root2.left node and assign value to it
        root2.left = new TreeNode(9);
        //Creating root2.right node and assign value to it
        root2.right = new TreeNode(20);
        //Creating root2.right.left node and assign value to it
        root2.right.left = new TreeNode(15);
        //Creating root2.right.right node and assign value to it
        root2.right.right = new TreeNode(7);
        //Creating object for MinDepthSolution class which has all logic for to find minimum depth
        SameTreeSolution sameTree = new SameTreeSolution();
        //Method calling, method return is tree same or not
        boolean isSame = sameTree.isSameTree(root1, root2);
        //Display result
        System.out.println("is tree same: " + isSame);
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

//Class containing all logic to find given two tree are same or not
class SameTreeSolution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null || p.val != q.val){
            return false;
        }
        boolean leftCheck = isSameTree(p.left, q. left);
        boolean rightCheck = isSameTree(p.right, q. right);
        return leftCheck && rightCheck;
    }
}
