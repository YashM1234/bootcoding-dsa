package com.bootcoding.dsa.leetcodel1;

import java.util.HashMap;
import java.util.Map;

/*
Leetcode Q-3046 WAP to Split the Array
You are given an integer array nums of even length.
You have to split the array into two parts nums1 and nums2 such that:
nums1.length == nums2.length == nums.length / 2.
nums1 should contain distinct elements.
nums2 should also contain distinct elements.
Return true if it is possible to split the array, and false otherwise.
 */
public class SplitTheArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4};
        //Method Calling
        boolean result = isPossibleToSplit(nums);
        System.out.println(result);
    }

    //Method Definition
    public static boolean isPossibleToSplit(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num: nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            if(freq.get(num) > 2) return false;
        }
        return true;
    }
}
