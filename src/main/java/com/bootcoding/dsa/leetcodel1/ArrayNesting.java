package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-565 WAP for Array Nesting
You are given an integer array nums of length n where nums is a permutation of the numbers in the range [0, n - 1].
You should build a set s[k] = {nums[k], nums[nums[k]], nums[nums[nums[k]]], ... } subjected to the following rule:
The first element in s[k] starts with the selection of the element nums[k] of index = k.
The next element in s[k] should be nums[nums[k]], and then nums[nums[nums[k]]], and so on.
We stop adding right before a duplicate element occurs in s[k].
Return the longest length of a set s[k].
 */
public class ArrayNesting {
    public static void main(String[] args) {
        int[] nums = {5,4,0,3,1,6,2};
        //Method Calling
        int result = arrayNesting(nums);
        System.out.println(result);
    }

    //Method Definition
    public static int arrayNesting(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n];
        int maxLen = 0;

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                int count = 0;
                int current = i;

                while(!visited[current]){
                    visited[current] = true;
                    current = nums[current];
                    count++;
                }

                maxLen = Math.max(maxLen, count);
            }
        }

        return maxLen;
    }
}
