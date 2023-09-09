package com.bootcoding.dsa.leetcodel1;
import java.util.ArrayList;
import java.util.List;
/* Leetcode Q-94 WAP for binary tree inorder traversal
Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */
public class BinaryTreeInOrderTraversal {
    public static void main(String[] args) {
        //Creating root node and assign value to it
        TreeNode root = new TreeNode(1);
        //Creating root.right node and assign value to it
        root.right = new TreeNode(2);
        //Creating root.right.left node and assign value to it
        root.right.left = new TreeNode(3);
        //Creating object for SolutionForInOrder class which has all logic for inOrder traversing
        SolutionForInOrder inOrderObj = new SolutionForInOrder();
        //Method calling, method return traversed arraylist
        ArrayList<Integer> traversedList = (ArrayList<Integer>)inOrderObj.inorderTraversal(root);//List casting to ArrayList
        //display tree data in inOrder manner
        for (int nodeVal : traversedList){
            System.out.println(nodeVal);
        }
    }
}
//This class representation each tree node itself
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
       this.val = val;
       this.left = null;
       this.right = null;
    }
}

//class to traverse tree in inOrder
class SolutionForInOrder { // Note: In leetcode class name is "Solution" so make changes
    ArrayList<Integer> inOrderList;
    public SolutionForInOrder(){
        inOrderList = new ArrayList<>();
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return inOrderList;
        }else{
            inorderTraversal(root.left);
            inOrderList.add(root.val);
            inorderTraversal(root.right);
        }
        return inOrderList;
    }
}