package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-48 WAP to rotate an image
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
DO NOT allocate another 2D matrix and do the rotation.
 */
public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        //Method Calling
        rotate(matrix);
        for(int row = 0; row < matrix[0].length; row++){
            for(int col = 0; col < matrix.length; col++){
                System.out.println(matrix[row][col]);
            }
        }
    }

    //Method Definition
    public static void rotate(int[][] matrix) {
        int rowLength = matrix[0].length;
        int colLength = matrix.length;
        //Transpose
        for(int row = 0; row < rowLength-1; row++){
            for(int col = row + 1; col < colLength; col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
        //Swap Columns
        for(int row = 0; row < rowLength; row++){
            for(int col = 0; col < matrix.length/2; col++){
                int temp = matrix[row][colLength-1];
                matrix[row][colLength-1] = matrix[row][col];
                matrix[row][col] = temp;
                colLength--;
            }
            colLength = matrix.length;
        }
    }
}
