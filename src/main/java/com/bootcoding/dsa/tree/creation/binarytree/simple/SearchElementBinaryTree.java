package com.bootcoding.dsa.tree.creation.binarytree.simple;
//WAP to search the given element in the binary tree
public class SearchElementBinaryTree {
    public boolean searchElement(TreeNode root, int target){
        if(root == null){
            return false;
        }
        if(root.data == target){
            return true;
        }
        boolean bool = searchElement(root.left, target);
        return bool || searchElement(root.right, target);
    }
}
