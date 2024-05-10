package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-74 WAP to search a 2d matrix
You are given an m x n integer matrix with the following two properties:
Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.
You must write a solution in O(log(m * n)) time complexity.
 */
public class SearchA2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 30;
        //Method Calling
        boolean isTarget = searchMatrix(matrix, target);
        System.out.println(isTarget);
    }
    //Method Definition
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;

        while(row <= matrix.length-1 && col >= 0){
            if(target == matrix[row][col]){
                return true;
            }
            else if(target < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}
