package com.bootcoding.dsa.leetcodel1;
import java.util.Arrays;
/* Leetcode Q-59 WAP to for spiral matrix II
Given a positive integer n, generate an n x n
matrix filled with elements from 1 to n2 in spiral order.
 */
public class SpiralMatrixII {
    public static void main(String[] args) {
        int n = 3;
        //Method Calling
        int[][] matrix = generateMatrix(n);
        //Display Matrix
        for(int[] row: matrix){
            System.out.println(Arrays.toString(row));
        }
    }

    //Method Definition
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int number = 1;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                matrix[top][i] = number++;
            }
            top++;
            for(int i = top; i <= bottom; i++){
                matrix[i][right] = number++;
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    matrix[bottom][i] = number++;
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    matrix[i][left] = number++;
                }
                left++;
            }
        }
        return matrix;
    }
}
