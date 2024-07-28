package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-62 WAP to solve unique paths problem
There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]).
The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]).
The robot can only move either down or right at any point in time.
Given the two integers m and n, return the number of possible unique paths that the robot can take to reach
the bottom-right corner.
The test cases are generated so that the answer will be less than or equal to 2 * 109.
 */
public class UniquePaths {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        //Method Calling
        int ways = uniquePaths(m, n);
        System.out.println(ways);
    }

    //Method Definition
    public static int uniquePaths(int m, int n) {
        if(m == 1 && n == 1){
            return 1;
        }
        int[][] ways = new int[m][n];

        for(int row = 0; row < m; row++){
            ways[row][0] = 1;
        }
        for(int col = 0; col < n; col++){
            ways[0][col] = 1;
        }
        for(int row = 1; row < m; row++){
            for(int col = 1; col < n; col++){
                ways[row][col] = ways[row-1][col] + ways[row][col-1];
            }
        }
        return ways[m-1][n-1];
    }
}
