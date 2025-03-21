package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Leetcode Q-3314 WAP to Construct The Minimum Bitwise Array I
You are given an array nums consisting of n prime integers.

You need to construct an array ans of length n, such that, for each index i,
the bitwise OR of ans[i] and ans[i] + 1 is equal to nums[i], i.e. ans[i] OR (ans[i] + 1) == nums[i].

Additionally, you must minimize each value of ans[i] in the resulting array.

If it is not possible to find such a value for ans[i] that satisfies the condition, then set ans[i] = -1.
*/
public class ConstructTheMinimumBitwiseArrayI {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(5);
        nums.add(7);
        //Method Calling
        int[] result = minBitwiseArray(nums);
        System.out.println(Arrays.toString(result));

    }

    //Method Definition
    public static int[] minBitwiseArray(List<Integer> nums) {
        int[] minArray = new int[nums.size()];

        for(int i = 0; i < nums.size(); i++){
            int num = nums.get(i);
            if(num % 2 == 0){
                minArray[i] = -1;
            }else{
                minArray[i] = num - ((num + 1) & (-num - 1)) / 2;
            }
        }
        return minArray;
    }
}
