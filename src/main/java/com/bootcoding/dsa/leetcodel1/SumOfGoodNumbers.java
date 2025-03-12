package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-3452 WAP to find Sum of Good Numbers
Given an array of integers nums and an integer k, an element nums[i] is considered good
if it is strictly greater than the elements at indices i - k and i + k (if those indices exist).
If neither of these indices exists, nums[i] is still considered good.

Return the sum of all the good elements in the array.
 */
public class SumOfGoodNumbers {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1,5,4};
        int k = 2;

        //Method Calling
        int goodNumberSum = sumOfGoodNumbers(nums, k);
        System.out.println(goodNumberSum);
    }

    //Method Definition
    public static int sumOfGoodNumbers(int[] nums, int k) {
        int goodNumberSum = 0;
        int len = nums.length;

        for(int i = 0; i <len; i++){
            boolean isGood = i - k < 0 || nums[ i ] > nums[ i - k ];
            if(i + k < len && nums[i] <= nums[i + k]){
                isGood = false;
            }
            if(isGood){
                goodNumberSum += nums[i];
            }
        }
        return goodNumberSum;
    }
}
