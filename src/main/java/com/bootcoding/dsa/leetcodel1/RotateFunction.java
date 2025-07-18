package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-396 WAP to Rotate Function
You are given an integer array nums of length n.
Assume arrk to be an array obtained by rotating nums by k positions clock-wise.
We define the rotation function F on nums as follow:
F(k) = 0 * arrk[0] + 1 * arrk[1] + ... + (n - 1) * arrk[n - 1].
Return the maximum value of F(0), F(1), ..., F(n-1).
The test cases are generated so that the answer fits in a 32-bit integer.
 */
public class RotateFunction {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 6};
        //Method Calling
        int result = maxRotateFunction(nums);
        System.out.println(result);
    }

    //Method Definition
    public static int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        int f = 0;

        for(int i = 0; i < n; i++){
            totalSum += nums[i];
            f += i * nums[i];
        }

        int max = f;

        for(int k = 1; k < n; k++){
            f = f + totalSum - n * nums[n - k];
            max = Math.max(max, f);
        }

        return max;
    }
}
