package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-938 WAP for range sum of binary search tree
Given the root node of a binary search tree and two integers low and high,
return the sum of values of all nodes with a value in the inclusive range [low, high].
 */
public class RangeSumOfBST {
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
        //Creating root.right.right node and assign value to it
        root.right.right = new TreeNode(18);
        //Creating object for RangeSumBSTSolution
        RangeSumBSTSolution rangeSumBSTSolution = new RangeSumBSTSolution();
        //Method calling, method return range sum
        int rangeSum = rangeSumBSTSolution.rangeSumBST(root, 7, 15);
        //Display range sum
        System.out.println("The range sum is: " + rangeSum);
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

//Class containing all logic to find the sum of given range in BST
class RangeSumBSTSolution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        low = 7;
        high = 15;
        int sum = 0;
        return rangeSum(root, low, high, sum);
    }
    private int rangeSum(TreeNode root, int low, int high, int sum){
        if(root == null){
            return sum;
        }
        if(root.val >= low && root.val <= high){
            sum = sum + root.val;
        }
        if(root.val > low){
            sum = rangeSum(root.left, low, high, sum);
        }
        if(root.val < high){
            sum = rangeSum(root.right, low, high, sum);
        }
        return sum;
    }
}
