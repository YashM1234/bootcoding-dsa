package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-343 WAP for Integer Break
Given an integer n, break it into the sum of k positive integers, where k >= 2,
and maximize the product of those integers.
Return the maximum product you can get.
 */
public class IntegerBreak {
    public static void main(String[] args) {
        int n = 10;
        //Method Calling
        int result = integerBreak(n);
        System.out.println(result);
    }

    //Method Definition
    public static int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            for(int j = 1; j < i; j++){
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }

        return dp[n];
    }
}
