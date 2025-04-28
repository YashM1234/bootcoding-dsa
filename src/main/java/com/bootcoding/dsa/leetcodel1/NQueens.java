package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Leetcode Q-51 WAP for N-Queens
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.
Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both
indicate a queen and an empty space, respectively.
 */
public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        //Method Calling
        List<List<String>> result = solveNQueens(n);
        System.out.println(result);
    }

    //Method Definition
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        for(char[] row: board) Arrays.fill(row, '.');

        boolean[] cols = new boolean[n];
        boolean[] diag1 = new boolean[2 * n - 1];
        boolean[] diag2 = new boolean[2 * n - 1];

        backtrack(0, board, result, n, cols, diag1, diag2);
        return result;
    }

    private static void backtrack(int row, char[][] board, List<List<String>> result, int n,
                                  boolean[] cols, boolean[] diag1, boolean[] diag2){
        if(row == n){
            result.add(construct(board));
            return;
        }

        for(int col = 0; col < n; col++){
            if(cols[col] || diag1[row - col + n - 1] || diag2[row + col]){
                    continue;
            }

            board[row][col] = 'Q';
            cols[col] = diag1[row - col + n - 1] = diag2[row + col] = true;

            backtrack(row + 1, board, result, n, cols, diag1, diag2);

            board[row][col] = '.';
            cols[col] = diag1[row - col + n - 1] = diag2[row + col] = false;
        }
    }

    private static List<String> construct(char[][] board){
        List<String> path = new ArrayList<>();
        for(char[] row: board){
            path.add(new String(row));
        }
        return path;
    }
}
