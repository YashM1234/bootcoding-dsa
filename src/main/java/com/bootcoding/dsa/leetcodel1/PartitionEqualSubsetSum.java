package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-416 WAP for Partition Equal Subset Sum
Given an integer array nums, return true if you can partition the array into two subsets such that the sum of the
elements in both subsets is equal or false otherwise.
 */
public class PartitionEqualSubsetSum {
    public static void main(String[] args) {
        int[] nums = {1,1,5,11,5,1};
        //Method Calling
        boolean result = canPartition(nums);
        System.out.println(result);
    }

    //Method Definition
    public static boolean canPartition(int[] nums) {
        int total = 0;
        for(int v: nums) total += v;

        if((total & 1) == 1) return false;
        int target = total / 2;

        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for(int num: nums){
            for(int s = target; s >= num; s--){
                dp[s] = dp[s] || dp[s - num];
            }
        }

        return dp[target];
    }
}
