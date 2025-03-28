package com.bootcoding.dsa.leetcodel1;

import java.util.HashMap;
import java.util.Map;

/*
Leetcode Q-1679 WAP to find max number of K-Sum Pairs
You are given an integer array nums and an integer k.
In one operation, you can pick two numbers from the array whose sum
equals k and remove them from the array.
Return the maximum number of operations you can perform on the array.
 */
public class MaxNumKSumPair {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int k = 5;
        //Method Calling
        int result = maxOperations(nums, k);
        System.out.println(result);
    }
    //Method Definition
    public static int maxOperations(int[] nums, int k) {
        if(nums.length < 2 || k < 1){
            return 0;
        }
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int temp = k - num;
            if (map.containsKey(temp)) {
                count++;
                if (map.get(temp) == 1) {
                    map.remove(temp);
                } else {
                    map.put(temp, map.get(temp) - 1);
                }
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return count;
    }
}
