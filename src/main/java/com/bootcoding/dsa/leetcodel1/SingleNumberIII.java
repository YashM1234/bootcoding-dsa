package com.bootcoding.dsa.leetcodel1;

import java.util.Arrays;

/*
Leetcode Q-260 WAP for Single Number III
Given an integer array nums, in which exactly two elements appear only once
and all the other elements appear exactly twice. Find the two elements that appear only once.
You can return the answer in any order.
You must write an algorithm that runs in linear runtime complexity and uses only
constant extra space.
 */
public class SingleNumberIII {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        //Method Calling
        int[] result = singleNumber(nums);
        System.out.println(Arrays.toString(result));
    }

    //Method Definition
    public static int[] singleNumber(int[] nums) {
        int xor = 0;

        for(int num: nums){
            xor ^= num;
        }

        int diffBit = xor & (-xor);

        int x = 0;
        int y = 0;

        for(int num: nums){
            if((num & diffBit) == 0){
                x ^= num;
            }else{
                y ^= num;
            }
        }

        return new int[]{x, y};
    }
}
