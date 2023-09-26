package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-53 WAP to find maximum subarray
Given an integer array nums, find the subarray
with the largest sum, and return its sum.
 */
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //Method Calling
        int sum = maxSubArray(nums);
        System.out.println(sum);
    }
    //Method Definition
    public static int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int number: nums){
            currentSum = currentSum + number;
            if(currentSum > sum){
                sum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return sum;
    }
}
