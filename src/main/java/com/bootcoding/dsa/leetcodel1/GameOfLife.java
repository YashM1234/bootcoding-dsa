package com.bootcoding.dsa.leetcodel1;

import java.util.Arrays;

/*
Leetcode Q-289 WAP for Game of Life
According to Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by
the British mathematician John Horton Conway in 1970."
The board is made up of an m x n grid of cells, where each cell has an initial state: live (represented by a 1) or
dead (represented by a 0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the
following four rules (taken from the above Wikipedia article):
Any live cell with fewer than two live neighbors dies as if caused by under-population.
Any live cell with two or three live neighbors lives on to the next generation.
Any live cell with more than three live neighbors dies, as if by over-population.
Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
The next state of the board is determined by applying the above rules simultaneously to every cell in the current
state of the m x n grid board. In this process, births and deaths occur simultaneously.
Given the current state of the board, update the board to reflect its next state.
Note that you do not need to return anything.
 */
public class GameOfLife {
    public static void main(String[] args) {
        int[][] board = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };

        gameOfLife(board);
        System.out.println(Arrays.deepToString(board));
    }

    //Method Definition
    public static void gameOfLife(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        int[][] directions = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, -1},           {0, 1},
                {1, -1},  {1, 0},  {1, 1}
        };

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                int liveNeighbors = 0;

                for(int[] dir: directions){
                    int nr = r + dir[0];
                    int nc = c + dir[1];
                    if(nr >= 0 && nr < rows && nc >= 0 && nc < cols){
                        if(board[nr][nc] == 1 || board[nr][nc] == 2){
                            liveNeighbors++;
                        }
                    }
                }

                if(board[r][c] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)){
                    board[r][c] = 2;
                } else if (board[ r ][ c ] == 0 && liveNeighbors == 3) {
                    board[r][c] = 3;
                }
            }
        }
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                if(board[r][c] == 2){
                    board[r][c] = 0;
                }else if(board[r][c] == 3){
                    board[r][c] = 1;
                }
            }
        }
    }
}
