package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-3427 WAP to find sum of variable length subarrays I
You are given an integer array nums of size n. For each index i where 0 <= i < n,
define a subarray nums[start ... i] where start = max(0, i - nums[i]).

Return the total sum of all elements from the subarray defined for each index in the array.
*/
public class SumOfVariableLengthSubarrays {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1};
        //Method Calling
        int result = subarraySum(nums);
        System.out.println(result);
    }

    //Method Definition
    public static int subarraySum(int[] nums) {
//        int sum = 0;
//        for(int i = 0; i < nums.length; i++){
//            int start = Math.max(0, i - nums[i]);
//            for(int j = start; j <= i; j++) {
//                sum = sum + nums[j];
//            }
//        }
//        return sum;
//    }

        //OR

        int sum = 0;
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int start = Math.max(0, i - nums[i]);
            if (start > 0) {
                sum += prefixSum - getPrefixSum(nums, start - 1);
            } else {
                sum += prefixSum;
            }
        }
        return sum;
    }

    private static int getPrefixSum(int[] nums, int idx) {
        int prefix = 0;
        for (int i = 0; i <= idx; i++) {
            prefix += nums[ i ];
        }
        return prefix;
    }
}
