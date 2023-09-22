package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q.701 WAP to inset node ito a binary search tree
You are given the root node of a binary search tree (BST) and a
value to insert into the tree. Return the root node of the BST after
the insertion. It is guaranteed that the new value does not exist in the original BST.
Notice that there may exist multiple valid ways for the insertion, as long as the tree
remains a BST after insertion. You can return any of them.
 */
public class InsertIntoBST {
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
        //Creating object for InsertIntoBSTSolution
        InsertIntoBSTSolution insertIntoBSTSolution = new InsertIntoBSTSolution();
        //Method calling, method return new root node
        TreeNode newRoot = insertIntoBSTSolution.insertIntoBST(root, 12);
        //Display new tree with inserted value in inOrder manner
        inOrderTraverse(newRoot);

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

//Class containing all logic to insert node in a binary search tree
class InsertIntoBSTSolution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        root = insert(root, val);
        return root;
    }
    private TreeNode insert(TreeNode root, int val){
        if(root == null){
            return new TreeNode(val);
        }
        if(root.val > val){
            root.left = insert(root.left, val);
        }
        else if(root.val < val){
            root.right = insert(root.right, val);
        }
        return root;
    }

    //OR

//    private TreeNode insert(TreeNode root, int val){
//        if(root == null){
//            return new TreeNode(val);
//        }
//        if(root.val > val){
//            if(root.left != null){
//                insert(root.left, val);
//            }else{
//                root.left = new TreeNode(val);
//            }
//        }
//        else if(root.val < val){
//            if(root.right != null){
//                insert(root.right, val);
//            }else{
//                root.right = new TreeNode(val);
//            }
//        }
//        return root;
//    }
}
