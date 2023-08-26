package com.bootcoding.dsa.leetcodel1;
import java.util.*;
/* Leetcode Q-1305 WAP for all element in two binary search tree
Given two binary search trees root1 and root2, return a list containing
all the integers from both trees sorted in ascending order.
 */
public class AllElementOfTwoBST {
    public static void main(String[] args) {
        //Creating root1 node and assign value to it
        TreeNode root1 = new TreeNode(1);
        //Creating root1.left node and assign value to it
       // root1.left = new TreeNode(1);
        //Creating root1.right node and assign value to it
        root1.right = new TreeNode(8);

        //Creating root2 node and assign value to it
        TreeNode root2 = new TreeNode(8);
        //Creating root2.left node and assign value to it
        root2.left = new TreeNode(1);
        //Creating root2.right node and assign value to it
       // root2.right = new TreeNode(3);

        //Create an object of class AllElementBSTSolution
        AllElementBSTSolution allElementBSTSolution = new AllElementBSTSolution();
        List<Integer> treeList = allElementBSTSolution.getAllElements(root1, root2);
        for(int element: treeList){
            System.out.println(element);
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

//Class containing all logic to convert BST to Greater
class AllElementBSTSolution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> treeList = new ArrayList<>();
        treeList = addElementInList(root1, root2, treeList);
        return treeList;
    }
    List<Integer> addElementInList(TreeNode current1, TreeNode current2, List<Integer> treeList){
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        inOrder(current1, q1);
        inOrder(current2, q2);

        while(!q1.isEmpty() || !q2.isEmpty()){
            if(q1.isEmpty()){
                treeList.add(q2.poll());
            }else if(q2.isEmpty()){
                treeList.add(q1.poll());
            }else if(q1.peek() < q2.peek()){
                treeList.add(q1.poll());
            }else{
                treeList.add(q2.poll());
            }
        }
        return treeList;
    }
    private void inOrder(TreeNode current, Queue<Integer> q){
        if(current != null){
            inOrder(current.left, q);
            q.add(current.val);
            inOrder(current.right, q);
        }
    }

    //OR

//    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
//        List<Integer> treeList = new ArrayList<>();
//        inOrderWay(root1, treeList);
//        inOrderWay(root2, treeList);
//        Collections.sort(treeList);
//
//        return treeList;
//    }
//    private void inOrderWay(TreeNode current, List<Integer> treeList){
//        if(current == null){
//            return;
//        }
//        inOrderWay(current.left, treeList);
//        treeList.add(current.val);
//        inOrderWay(current.right, treeList);
//    }
}