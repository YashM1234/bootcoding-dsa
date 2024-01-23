package com.bootcoding.dsa.leetcodel1;
/*
Leetcode Q-334 WAP to solve the Increasing Triplet Subsequence problem
Given an integer array nums, return true if there exists a triple of
indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k].
If no such indices exists, return false.
 */
public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        int[] num = {20,100,10,12,5,13};
        //Method Calling
        boolean result = increasingTriplet(num);
        System.out.println(result);
    }

    //Method Definition
    public static boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= i) {
                i = num;
            } else if (num <= j) {
                j = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
