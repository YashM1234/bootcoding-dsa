package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-453 WAP to find Minimum Moves to  Equal Array Elements
Given an integer array nums of size n, return the minimum number of moves
required to make all array elements equal.
In one move, you can increment n - 1 elements of the array by 1.
 */
public class MinimumMovesToEqualArrayElements {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        //Method Calling
        int result = minMoves(nums);
        System.out.println(result);
    }

    //Method Definition
    public static int minMoves(int[] nums){
        int min = Integer.MAX_VALUE;
        long sum = 0;

        for(int num: nums){
            sum += num;
            min = Math.min(min, num);
        }

        return (int)(sum - (long)min * nums.length);
    }
}
