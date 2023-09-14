package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-108 WAP to convert sorted array to binary search tree
public class ConvertSortedArrToBST {
    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        //Create an object for SortedArrToBSTSolution
        SortedArrToBSTSolution sortedArrToBSTSolution = new SortedArrToBSTSolution();
        TreeNode root = sortedArrToBSTSolution.sortedArrayToBST(nums);
        //Display BST in inorder manner
        inOrderTraverse(root);
    }
    public static void inOrderTraverse(TreeNode root){
        if(root != null){
            inOrderTraverse(root.left);
            System.out.println(root.val);
            inOrderTraverse(root.right);
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

//Class containing all logic to find to convert sorted array into BST
class SortedArrToBSTSolution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return insertBST(nums, 0, nums.length-1);
    }
    private TreeNode insertBST(int[] nums, int low, int high){
        if(low > high){
            return null;
        }
        int mid = (low + high)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = insertBST(nums, low, mid-1);
        root.right = insertBST(nums, mid+1, high);
        return root;
    }
}