package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-867 WAP to transpose matrix
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //Method calling
        int[][] matrixTranspose = transpose(matrix);
        //Display transpose matrix
        for(int row = 0; row < matrixTranspose.length; row++){
            for(int col = 0; col < matrixTranspose[0].length; col++){
                System.out.print(matrixTranspose[row][col] + " ");
            }
        }
    }

    //Method Definition
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] matrixT = new int[n][m];
        for(int row = 0; row < m; row++){
            for(int col = 0; col < n; col++){
                matrixT[col][row] = matrix[row][col];
            }
        }
        return matrixT;
    }
}
