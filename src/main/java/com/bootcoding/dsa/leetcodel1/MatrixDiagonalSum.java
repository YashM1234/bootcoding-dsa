package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-1572 WAP for matrix diagonal sum
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 1}, {4, 5, 6, 2}, {7, 8, 9, 3}, {3, 9, 8, 7}};
        //Method Calling
        int mDiagonalSum = diagonalSum(matrix);
        System.out.println(mDiagonalSum);
    }

    //Method Definition
    public static int diagonalSum(int[][] mat) {
        int length = mat.length;
        int sum = 0;

        for(int i = 0; i < length; i++){
            sum = sum + mat[i][i];//Add primary diagonal element

            sum = sum + mat[length - 1 - i][i];//Add secondary diagonal element
        }
        //As middle value is add twice hence subtract it once
        if(length % 2 != 0){
            sum = sum - mat[length/2][length/2];
        }
        return sum;
    }
}
