package com.bootcoding.dsa.leetcodel1;
import java.util.Arrays;
/* Leetcode Q-73 WAP to set matrix zeroes
Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's.
 */
public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        //Method Calling
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    //Method Definition
    public static void setZeroes(int[][] matrix) {
        int setZero = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) {
                        setZero = 0;
                    } else {
                        matrix[0][j] = 0;
                        matrix[i][0] = 0;
                    }
                }
            }
        }

        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0){
            for (int i = 0; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
        if(setZero == 0){
            Arrays.fill(matrix[ 0 ], 0);
        }
    }
}
