package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-413 WAP for Arithmetic Slices
An integer array is called arithmetic if it consists of at least three elements and if the difference between
any two consecutive elements is the same.
For example, [1,3,5,7,9], [7,7,7,7], and [3,-1,-5,-9] are arithmetic sequences.
Given an integer array nums, return the number of arithmetic subarrays of nums.
A subarray is a contiguous subsequence of the array.
 */
public class ArithmeticSlices {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        //Method Calling
        int result = numberOfArithmeticSlices(nums);
        System.out.println(result);
    }
    //Method Definition
    public static int numberOfArithmeticSlices(int[] nums) {
        if(nums.length < 3) return 0;

        int total = 0;
        int current = 0;

        for(int i = 2; i < nums.length; i++){
            if(nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]){
                current++;
                total += current;
            }else{
                current = 0;
            }
        }

        return total;
    }
}
