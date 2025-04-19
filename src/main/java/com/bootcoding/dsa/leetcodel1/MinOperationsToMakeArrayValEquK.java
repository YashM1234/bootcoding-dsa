package com.bootcoding.dsa.leetcodel1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
Leetcode Q-3375 WAP to Find Minimum Operations to Make Array Values Equal to K
You are given an integer array nums and an integer k.
An integer h is called valid if all values in the array that are strictly greater than h are identical.
For example, if nums = [10, 8, 10, 8], a valid integer is h = 9 because all nums[i] > 9 are equal to 10,
but 5 is not a valid integer.
You are allowed to perform the following operation on nums:
Select an integer h that is valid for the current values in nums.
For each index i where nums[i] > h, set nums[i] to h.
Return the minimum number of operations required to make every element in nums equal to k.
If it is impossible to make all elements equal to k, return -1. */
public class MinOperationsToMakeArrayValEquK {
    public static void main(String[] args) {
        int[] nums = {9,7,5,3};
        int k = 1;

        //Method Calling
        int result = minOperations(nums, k);
        System.out.println(result);

    }

    //Method Definition
    public static int minOperations(int[] nums, int k) {
        int operations = 0;
        Set<Integer> uniqueValues = new HashSet<>();

        for(int num: nums){
            uniqueValues.add(num);
        }

        for(int uniqueValue: uniqueValues){
            if(uniqueValue > k){
                operations++;
            }else if(uniqueValue < k){
                return -1;
            }
        }
        return operations;
    }
}
