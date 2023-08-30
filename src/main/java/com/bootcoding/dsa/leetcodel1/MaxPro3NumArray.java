package com.bootcoding.dsa.leetcodel1;
import java.util.Arrays;
//Leetcode Q-628. WAP to find Maximum Product of Three Numbers in an array
public class MaxPro3NumArray {
    public static void main(String[] args) {
        int[] nums = {1, 8, 22, -2, 0, -9, 100};
        //Method calling
        int max = maximumProduct(nums);
        System.out.println(max);
    }
    //Method Definition
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int x = nums.length;
        return Math.max(nums[0]*nums[1]*nums[x-1], nums[x-1]*nums[x-2]*nums[x-3]);
    }
}
