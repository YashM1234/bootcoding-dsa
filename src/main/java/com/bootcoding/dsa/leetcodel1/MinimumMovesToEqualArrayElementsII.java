package com.bootcoding.dsa.leetcodel1;

import java.util.Arrays;

/*
Leetcode Q-462 WAP to find the Minimum Moves to Equal Array Elements II
Given an integer array nums of size n, return the minimum number of moves
required to make all array elements equal.
In one move, you can increment or decrement an element of the array by 1.
Test cases are designed so that the answer will fit in a 32-bit integer.
 */
public class MinimumMovesToEqualArrayElementsII {
    public static void main(String[] args) {
        int[] nums = {1,10,2,9};
        //Method Calling
        int result = minMoves2(nums);
        System.out.println(result);
    }

    //Method Definition
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int median = nums[n / 2];
        int moves = 0;

        for(int num: nums){
            moves += Math.abs(num - median);
        }

        return moves;
    }
}
