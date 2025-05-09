package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-2923 WAP to Find Champion I
There are n teams numbered from 0 to n - 1 in a tournament.
Given a 0-indexed 2D boolean matrix grid of size n * n.
For all i, j that 0 <= i, j <= n - 1 and i != j team i is stronger than team j if grid[i][j] == 1,
otherwise, team j is stronger than team i.
Team a will be the champion of the tournament if there is no team b that is stronger than team a.
Return the team that will be the champion of the tournament.
 */
public class FindChampionI {
    public static void main(String[] args) {
        int[][] grid = {
            {0,1},
            {0,0}
        };
        //Method Calling
        int result = findChampion(grid);
        System.out.println(result);
    }

    //Method Definition
    public static int findChampion(int[][] grid) {
        int n = grid.length;

        for(int i = 0; i < n; i ++){
            boolean isChampion = true;
            for(int j = 0; j < n; j++){
                if(i != j && grid[i][j] == 0){
                    isChampion = false;
                    break;
                }
            }
            if(isChampion) return i;

        }
        return -1;
    }
}
