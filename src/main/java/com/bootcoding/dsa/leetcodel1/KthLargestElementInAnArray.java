package com.bootcoding.dsa.leetcodel1;
import java.util.Arrays;
//Leetcode Q-215 WAP to find Kth Largest Element in an array
public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        //Method Calling
        int result = findKthLargest(nums, k);
        System.out.println(result);
    }

    //Method Definition
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        k = nums.length - k;
        return nums[k];
    }
}
