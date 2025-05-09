package com.bootcoding.dsa.leetcodel1;

import java.util.TreeSet;

/*
Leetcode Q-220 WAP for Contains Duplicate III
You are given an integer array nums and two integers indexDiff and valueDiff.
Find a pair of indices (i, j) such that:
i != j,
abs(i - j) <= indexDiff.
abs(nums[i] - nums[j]) <= valueDiff, and
Return true if such pair exists or false otherwise.
 */
public class ContainsDuplicateIII {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int indexDiff = 3;
        int valueDiff = 0;
        //Method Calling
        boolean result = containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff);
        System.out.println(result);
    }

    //Method Definition
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long> set = new TreeSet<>();

        for(int i = 0; i < nums.length; i++){
            long curr = (long) nums[i];

            Long floor = set.ceiling(curr - valueDiff);
            if(floor != null && floor <= curr + valueDiff){
                return true;
            }

            set.add(curr);

            if(i >= indexDiff){
                set.remove((long) nums[i - indexDiff]);
            }
        }

        return false;
    }
}
