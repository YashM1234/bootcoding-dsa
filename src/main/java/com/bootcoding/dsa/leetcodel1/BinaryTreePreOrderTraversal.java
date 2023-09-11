package com.bootcoding.dsa.leetcodel1;
import java.util.ArrayList;
import java.util.List;
/* Leetcode Q-144 WAP for binary tree preorder traversal
Given the root of a binary tree, return the preorder traversal of its nodes' values.
 */
public class BinaryTreePreOrderTraversal {
    public static void main(String[] args) {
        //Creating root node and assign value to it
        TreeNode root = new TreeNode(1);
        //Creating root.right node and assign value to it
        root.right = new TreeNode(2);
        //Creating root.right.left node and assign value to it
        root.right.left = new TreeNode(3);
        //Creating object for SolutionForPreOrder class which has all logic for preOrder traversing
        SolutionForPreOrder preOrder = new SolutionForPreOrder();
        //Method calling, method return traversed arraylist
        ArrayList<Integer> traverseList = (ArrayList<Integer>)preOrder.preorderTraversal(root);//List cast to ArrayList
        //Display tree in preOrder manner
        for(int nodeVal: traverseList){
            System.out.println(nodeVal);
        }
    }
}
//This class represent each tree node itself
//class TreeNode{
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    public TreeNode(int val){
//        this.val = val;
//        this.left = null;
//         this.right = null;
//    }
//}
//This class contain all the logic for traversing tree in preOrder manner
class SolutionForPreOrder {//Note: leetcode has class name "Solution" so make changes
    List<Integer> preOrderList;
    public SolutionForPreOrder(){
        preOrderList = new ArrayList<>();
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return preOrderList;
        }
        else{
            preOrderList.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return preOrderList;
    }
}
