package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-240 WAP to search a 2d matrixII
Write an efficient algorithm that searches for a value target in an m x n integer matrix.
This matrix has the following properties:
Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
 */
public class SearchA2DMatrixII {
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 17;
        //Method Calling
        boolean isTarget = searchMatrix(matrix, target);
        System.out.println(isTarget);
    }
    //Method Definition
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;

        while (row <= matrix.length-1 && col >= 0){
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
