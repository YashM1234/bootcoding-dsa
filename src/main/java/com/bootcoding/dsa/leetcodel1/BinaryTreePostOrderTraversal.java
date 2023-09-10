package com.bootcoding.dsa.leetcodel1;
import java.util.ArrayList;
import java.util.List;
/* Leetcode Q-145 WAP for binary tree postorder traversal
Given the root of a binary tree, return the postorder traversal of its nodes' values.
 */
public class BinaryTreePostOrderTraversal {
    public static void main(String[] args) {
        //Creating root node and assign value to it
        TreeNode root = new TreeNode(1);
        //Creating root.right node and assign value to it
        root.right = new TreeNode(2);
        //Creating root.right.left node and assign value to it
        root.right.left = new TreeNode(3);
        //Creating object for SolutionForPostOrder class which has all logic for postOrder traversing
        SolutionForPostOrder postOrder = new SolutionForPostOrder();
        //Method calling, method return traversed arraylist
        ArrayList<Integer> traverseList = (ArrayList<Integer>)postOrder.postorderTraversal(root);//List cast to ArrayList
        //Display tree in postOrder manner
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

//This class contain all the logic for traversing tree in postOrder manner
class SolutionForPostOrder {//Note: leetcode has class name "Solution" so make changes
    List<Integer> postOrderList;
    public SolutionForPostOrder(){
        postOrderList = new ArrayList<>();
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null){
            return postOrderList;
        }
        else{
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            postOrderList.add(root.val);
        }
        return postOrderList;
    }
}
