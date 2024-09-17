package com.bootcoding.dsa.leetcodel1;
/*
Leetcode Q-268 WAP to find missing number
Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        //Method Calling
        int missingNum = missingNumber(nums);
        System.out.println(missingNum);
    }

    //Method Definition
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int maxArraySum = n*(n+1) / 2;
        int totalArraySum = 0;

        for (int num : nums) {
            totalArraySum = totalArraySum + num;
        }
        return maxArraySum - totalArraySum;
    }
}
