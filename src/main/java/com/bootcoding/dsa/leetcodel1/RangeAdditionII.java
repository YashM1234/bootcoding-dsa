package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-598 WAP for Range Addition II
You are given an m x n matrix M initialized with all 0's and an array of operations ops,
where ops[i] = [ai, bi] means M[x][y] should be incremented by one for all 0 <= x < ai and 0 <= y < bi.
Count and return the number of maximum integers in the matrix after performing all the operations.
 */
public class RangeAdditionII {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] ops = {
                {2,2},
                {3,3}
                };
        //Method Calling
        int result = maxCount(m, n, ops);
        System.out.println(result);
    }

    //Method Definition
    public static int maxCount(int m, int n, int[][] ops) {
        if(ops.length == 0) return m * n;

        int minA = m;
        int minB = n;

        for(int[] op: ops){
            minA = Math.min(minA, op[0]);
            minB = Math.min(minB, op[1]);
        }

        return minA * minB;
    }
}
