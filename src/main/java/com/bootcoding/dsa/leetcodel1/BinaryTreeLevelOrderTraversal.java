package com.bootcoding.dsa.leetcodel1;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* Leetcode Q-102 WAP for binary tree level order traversal
Given the root of a binary tree, return the level order traversal
of its nodes' values. (i.e., from left to right, level by level).
 */
public class BinaryTreeLevelOrderTraversal {
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
        //Creating object for BinaryTreeLevelOrderTraversal class which has all logic for Binary Tree Level Order Traversal
        BinaryTreeLevelOrderTraversalSolution binaryTreeLevelOrderTraversalSolution = new BinaryTreeLevelOrderTraversalSolution();
        //Method calling
        List<List<Integer>> traversedList = binaryTreeLevelOrderTraversalSolution.levelOrder(root);//List casting to ArrayList
        //display tree data
        System.out.println(traversedList);
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

//class to traverse binary tree in level order
class BinaryTreeLevelOrderTraversalSolution {
    List<List<Integer>> list;
    Queue<TreeNode> queue;
    public BinaryTreeLevelOrderTraversalSolution(){
        list = new ArrayList<>();
        queue = new LinkedList<>();
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return list;
        }

        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> tempList = new ArrayList<>();
            for(int index = 0; index < size; index++){
                if(queue.peek().left != null){
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.add(queue.peek().right);
                }
                tempList.add(queue.remove().val);
            }
            list.add(tempList);
        }
        return list;
    }
}