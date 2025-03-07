package com.bootcoding.dsa.leetcodel1;

import java.util.Arrays;

/*
Leetcode Q-414 WAP to find Third Maximum Number
Given an integer array nums, return the third distinct maximum number in this array.
If the third maximum does not exist, return the maximum number.
 */
public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {3, 5, 5, 3, 9, 2, 1};
        //Method Calling
        int max = thirdMax(nums);
        System.out.println(max);
    }

    //Method Definition
    public static int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for(int num : nums) {
            if(firstMax == num || secondMax == num || thirdMax == num) {
                continue;
            }

            if(firstMax <= num){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            }else if(secondMax <= num){
                thirdMax = secondMax;
                secondMax = num;
            }else if(thirdMax <= num){
                thirdMax = num;
            }
        }

        if(thirdMax == Long.MIN_VALUE){
            return (int) firstMax;
        }
        return (int) thirdMax;
    }
}
