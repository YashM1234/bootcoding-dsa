package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayList;
import java.util.List;

/*
Leetcode Q-3417 WAP for Zigzag grid traversal with skip
You are given an m x n 2D array grid of positive integers.
Your task is to traverse grid in a zigzag pattern while skipping every alternate cell.
Zigzag pattern traversal is defined as following the below actions:
Start at the top-left cell (0, 0).
Move right within a row until the end of the row is reached.
Drop down to the next row, then traverse left until the beginning of the row is reached.
Continue alternating between right and left traversal until every row has been traversed.
Note that you must skip every alternate cell during the traversal.
Return an array of integers result containing, in order,
the value of the cells visited during the zigzag traversal with skips.
 */
public class ZigzagGridTraversalWithSkip {
    public static void main(String[] args) {
        int[][] grid = {
                {2,1},
                {2,1},
                {2,1}
        };
        //Method Calling
        List<Integer> result = zigzagTraversal(grid);
        System.out.println(result.toString());
    }

    //Method Definition
    public static List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> result = new ArrayList<>();
        if(grid == null || grid.length == 0) return result;

        int n = grid[0].length;
        boolean leftToRight = true;
        boolean skip = false;

        for (int[] digit : grid) {
            if (leftToRight) {
                for (int j = 0; j < n; j++) {
                    if (!skip) {
                        result.add(digit[j]);
                    }
                    skip = !skip;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    if (!skip) {
                        result.add(digit[j]);
                    }
                    skip = !skip;
                }
            }
            leftToRight = !leftToRight;
        }
        return result;
    }
}
