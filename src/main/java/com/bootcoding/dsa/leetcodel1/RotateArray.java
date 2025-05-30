package com.bootcoding.dsa.leetcodel1;

import java.util.Arrays;

/*
Leetcode Q-189 WAP to Rotate Array
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        //Method Calling
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    //Method Definition
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);

        reverse(nums, 0, k - 1);

        reverse(nums, k, n - 1);

    }

    private static void reverse(int[] nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
