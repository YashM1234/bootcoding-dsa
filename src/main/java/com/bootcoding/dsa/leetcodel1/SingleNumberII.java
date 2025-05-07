package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-137 WAP Single Number II
Given an integer array nums where every element appears three times except for one,
which appears exactly once. Find the single element and return it.
You must implement a solution with a linear runtime complexity and use only constant extra space.
 */
public class SingleNumberII {
    public static void main(String[] args) {
        int[] nums = {2,2,3,2};
        //Method Calling
        int result = singleNumber(nums);
        System.out.println(result);
    }

    //Method Definition
    public static int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;
        for(int num: nums){
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }

        return ones;
    }
}
