package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-1351 WAP to count negative number in a sorted matrix
Given a m x n matrix grid which is sorted in non-increasing order both
row-wise and column-wise, return the number of negative numbers in grid.
 */
public class CountNegativeNumSortedMatrix {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1}, {3,2,1,-1}, {1,1,-1,-2}, {-1,-1,-2,-3}};
        //Method Calling
        int count = countNegatives(grid);
        System.out.println(count);
    }

    //Method Definition
    public static int countNegatives(int[][] grid) {
        int cSize = grid[0].length;
        int rSize = grid.length;
        int count = 0;
        for(int row = rSize-1; row >= 0; row--){
            for(int col = 0; col < cSize; col++){
                if(grid[row][col] < 0){
                    count = count + cSize - col;
                    break;
                }
            }
            //if no negative value present directly break
            if(count == 0){
                break;
            }
        }
        return count;

        //OR

//        int size = grid[0].length;
//        int count = 0;
//        for(int[] row: grid){
//            for(int col = size-1; col >= 0; col--){
//                if(row[col] >= 0){
//                    break;
//                }
//                count++;
//            }
//        }
//        return count;
    }
}
