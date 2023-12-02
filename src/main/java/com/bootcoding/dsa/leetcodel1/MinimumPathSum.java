package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-64 WAP to find minimum path sum
Given a m x n grid filled with non-negative numbers, find a path from top left
to bottom right, which minimizes the sum of all numbers along its path.
Note: You can only move either down or right at any point in time.
 */
public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        //Method Calling
        int minimumPathSum = minPathSum(grid);
        System.out.println(minimumPathSum);
    }
    //Method Definition
    public static int minPathSum(int[][] grid) {
        int rowLength = grid.length;
        int colLength = grid[0].length;
        int minPath[][] = new int[rowLength][colLength];

        return minPathFinder(grid, rowLength - 1, colLength - 1, minPath);
    }

    private static int minPathFinder(int[][] grid, int rowLength, int colLength, int[][] minPath){
        if(rowLength == 0 && colLength == 0){
            return grid[rowLength][colLength];
        }
        else if(rowLength < 0 || colLength < 0){
            return Integer.MAX_VALUE;
        }
        else if(minPath[rowLength][colLength] != 0){
            return minPath[rowLength][colLength];
        }
        return minPath[rowLength][colLength] = grid[rowLength][colLength] + Math.min(minPathFinder(grid, rowLength - 1, colLength, minPath), minPathFinder(grid, rowLength, colLength - 1, minPath));
    }
}
