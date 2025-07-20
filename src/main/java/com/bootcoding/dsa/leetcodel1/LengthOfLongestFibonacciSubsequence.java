package com.bootcoding.dsa.leetcodel1;

import java.util.HashMap;
import java.util.Map;

/*
Leetcode Q-873 WAP to find the Length of Longest Fibonacci Subsequence
A sequence x1, x2, ..., xn is Fibonacci-like if:
n >= 3
xi + xi+1 == xi+2 for all i + 2 <= n
Given a strictly increasing array arr of positive integers forming a sequence, return the length of the
longest Fibonacci-like subsequence of arr. If one does not exist, return 0.
A subsequence is derived from another sequence arr by deleting any number of elements (including none)
from arr, without changing the order of the remaining elements. For example, [3, 5, 8] is a subsequence of [3, 4, 5, 6, 7, 8].
 */
public class LengthOfLongestFibonacciSubsequence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        //Method Calling
        int result = lenLongestFibSubseq(arr);
        System.out.println(result);
    }

    //Method Definition
    public static int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        int maxLen = 0;

        Map<Integer, Integer> indexMap = new HashMap<>();
        for(int i = 0; i < n; i++){
            indexMap.put(arr[i], i);
        }

        int[][] dp = new int[n][n];

        for(int k = 0; k < n; k++){
            for(int j = 0; j < k; j++){
                int iVal = arr[k] - arr[j];
                if(iVal < arr[j] && indexMap.containsKey(iVal)){
                    int i = indexMap.get(iVal);
                    dp[j][k] = dp[i][j] + 1;
                    maxLen = Math.max(maxLen, dp[j][k]);
                }else{
                    dp[j][k] = 2;
                }
            }
        }

        return maxLen > 2 ? maxLen : 0;
    }
}
