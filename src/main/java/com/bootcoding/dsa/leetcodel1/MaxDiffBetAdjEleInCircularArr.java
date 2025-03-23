package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-3423 WAP to Find Maximum Difference Between Adjacent Elements in a Circular Array
Given a circular array nums, find the maximum absolute difference between adjacent elements.
Note: In a circular array, the first and last elements are adjacent.
*/
public class MaxDiffBetAdjEleInCircularArr {
    public static void main(String[] args) {
        int[] nums = {-5,-10,-5};
        //Method Calling
        int result = maxAdjacentDistance(nums);
        System.out.println(result);
    }

    //Method Definition
    public static int maxAdjacentDistance(int[] nums) {
        int maxDiff = 0;
        for (int i = 0; i < nums.length; i++) {
            int diff = Math.abs(nums[i] - nums[(i + 1) % nums.length]);
            maxDiff = Math.max(maxDiff, diff);
        }

        return maxDiff;
    }
}
