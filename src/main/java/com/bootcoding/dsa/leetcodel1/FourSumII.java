package com.bootcoding.dsa.leetcodel1;

import java.util.HashMap;
import java.util.Map;

/*
Leetcode Q-454 WAP to solve 4SumII Problem
Given four integer arrays nums1, nums2, nums3, and nums4 all of length n, return the number of tuples (i, j, k, l)
such that:
0 <= i, j, k, l < n
nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
 */
public class FourSumII {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {-2,-1};
        int[] nums3 = {-1,2};
        int[] nums4 = {0,2};
        //Method Calling
        int result = fourSumCount(nums1, nums2, nums3, nums4);
        System.out.println(result);
    }

    //Method Definition
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int a: nums1){
            for(int b: nums2){
                int sum = a + b;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        int count = 0;

        for(int c: nums3){
            for(int d: nums4){
                int sum = c + d;
                count += map.getOrDefault(-sum, 0);
            }
        }

        return count;
    }
}
