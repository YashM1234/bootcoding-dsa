package com.bootcoding.dsa.leetcodel1;

import java.util.Arrays;

/*
Leetcode Q-16 WAP for 3 Sum Closest
Given an integer array nums of length n and an integer target, find three integers in nums
such that the sum is closest to target.
Return the sum of the three integers.
You may assume that each input would have exactly one solution.
 */
public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        //Method Calling
        int result = threeSumClosest(nums, target);
        System.out.println(result);
    }

    //Method Definition
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2];

        for(int i = 0; i < n - 2; i++){
            int left = i + 1;
            int right = n - 1;

            while(left < right){
                int currentSum = nums[i] + nums[left] + nums[right];

                if(Math.abs(currentSum - target) < Math.abs(closestSum - target)){
                    closestSum = currentSum;
                }

                if(currentSum < target){
                    left++;
                }else if(currentSum > target){
                    right--;
                }else{
                    return currentSum;
                }
            }
        }
        return closestSum;
    }
}
