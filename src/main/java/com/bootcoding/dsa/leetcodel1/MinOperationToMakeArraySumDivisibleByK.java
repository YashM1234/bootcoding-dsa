package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-3512 WAP to Find Minimum Operations to Make Array Sum Divisible by K
You are given an integer array nums and an integer k. You can perform the following operation any number of times:
Select an index i and replace nums[i] with nums[i] - 1.
Return the minimum number of operations required to make the sum of the array divisible by k.
 */
public class MinOperationToMakeArraySumDivisibleByK {
    public static void main(String[] args) {
        int[] nums = {3,9,7};
        int k = 5;
        //Method Calling
        int result = minOperations(nums, k);
        System.out.println(result);
    }

    //Method Definition
    public static int minOperations(int[] nums, int k) {
        int totalSum = 0;

        for(int num: nums){
            totalSum += num;
        }

        return totalSum % k;

        //OR

//        int count = 0;
//        int totalSum = 0;
//
//        for(int num: nums){
//            totalSum += num;
//        }
//        while(totalSum % k != 0){
//            totalSum -= 1;
//            count++;
//        }
//        return count;
    }
}
