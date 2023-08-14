package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-463 WAP for island perimeter
You are given row x col grid representing a map where grid[i][j] = 1 represents land
and grid[i][j] = 0 represents water. One cell is a square with side length 1.
 */
public class IslandPerimeter {
    public static void main(String[] args) {
        int[][] grid = {{0,1,0,0}, {1,1,1,0}, {0,1,0,0}, {1,1,0,0}};
        //Method Calling
        int perimeter = islandPerimeter(grid);
        System.out.println(perimeter);
    }

    //Method Definition
    public static int islandPerimeter(int[][] grid) {
        int rSize = grid.length;
        int cSize = grid[0].length;
        int perimeter = 0;
        for(int row = 0; row < rSize; row++){
            for(int col = 0; col < cSize; col++){
                if(grid[row][col] == 1){
                    perimeter = perimeter + 4;
                    if(row > 0 && grid[row - 1][col] == 1){
                        perimeter = perimeter - 2;
                    }
                    if(col > 0 && grid[row][col - 1] == 1){
                        perimeter = perimeter - 2;
                    }
                }
            }
        }
        return perimeter;
    }
}
