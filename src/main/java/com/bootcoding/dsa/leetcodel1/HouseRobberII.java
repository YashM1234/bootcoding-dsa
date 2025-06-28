package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-213 WAP for House Robber II
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed.
All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one.
Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two
adjacent houses were broken into on the same night.
Given an integer array nums representing the amount of money of each house, return the maximum amount of money you
can rob tonight without alerting the police.
 */
public class HouseRobberII {
    public static void main(String[] args) {
        int[] nums = {2,3,2,5,6,2,1};

        //Method Calling
        int result = rob(nums);
        System.out.println(result);
    }

    //Method Definition
    public static int rob(int[] nums) {
        int n = nums.length;

        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);

        return Math.max(robLinear(nums, 0, n - 2), robLinear(nums, 1, n - 1));
    }

    //Helper Method
    private static int robLinear(int[] nums, int start, int end){
        int prev1 = 0;
        int prev2 = 0;

        for(int i = start; i <= end; i++){
            int temp = prev1;
            prev1 = Math.max(prev2 + nums[i], prev1);
            prev2 = temp;
        }

        return prev1;
    }
}
