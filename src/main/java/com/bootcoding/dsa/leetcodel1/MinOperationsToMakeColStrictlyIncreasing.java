package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-3402 WAP to find Minimum operations to make columns strictly increasing
You are given a m x n matrix grid consisting of non-negative integers.
In one operation, you can increment the value of any grid[i][j] by 1.
Return the minimum number of operations needed to make all columns of grid strictly increasing.
*/
public class MinOperationsToMakeColStrictlyIncreasing {
    public static void main(String[] args) {
        int[][] grid = {
                {3,2},
                {1,3},
                {3,4},
                {0,1}
        };
        //Method Calling
        int result = minimumOperations(grid);
        System.out.println(result);
    }

    //Method Definition
    public static int minimumOperations(int[][] grid) {
        int rowLen = grid.length;
        int colLen = grid[0].length;
        int operation = 0;

        for(int col = 0; col < colLen; col++){
            for(int row = 1; row < rowLen; row++){
                if(grid[row][col] <= grid[row - 1][col]){
                    int increase = (grid[row - 1][col] - grid[row][col]) + 1;
                    grid[row][col] += increase;
                    operation += increase;
                }
            }
        }
        return operation;
    }
}
