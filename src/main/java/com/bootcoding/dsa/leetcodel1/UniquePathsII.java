package com.bootcoding.dsa.leetcodel1;
import java.util.Arrays;
/* Leetcode Q-63 WAP to find unique paths II
You are given an m x n integer array grid. There is a robot initially
located at the top-left corner (i.e., grid[0][0]). The robot tries to move
to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only
move either down or right at any point in time.
An obstacle and space are marked as 1 or 0 respectively in a grid. A path
that the robot takes cannot include any square that is an obstacle.
Return the number of possible unique paths that the robot can take to reach the bottom-right corner.
 */
public class UniquePathsII {
    public static void main(String[] args) {
        int[][] obstacleGrid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        //Method Calling
        int ways = uniquePathsWithObstacles(obstacleGrid);
        System.out.println(ways);
    }
    //Method Definition
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] tempArr = new int[m][n];
        for(int[] row: tempArr){
            Arrays.fill(row,-1);
        }
        return uniquePath(obstacleGrid, m-1 ,n-1, tempArr);
    }
    //we go from grid[m - 1][n - 1] to grid[0][0]
    private static int uniquePath(int[][] obstacleGrid, int m, int n, int[][] tempArr){
        if(obstacleGrid[m][n] == 1){
            return 0;
        }
        if(m == 0 && n == 0){
            return 1;
        }
        if(tempArr[m][n] != -1){
            return tempArr[m][n];
        }
        int ways = 0;
        if(m > 0){
            ways = ways + uniquePath(obstacleGrid, m - 1, n, tempArr);
        }
        if (n > 0){
            ways = ways + uniquePath(obstacleGrid, m, n - 1, tempArr);
        }
        return tempArr[m][n] = ways;
    }
}
