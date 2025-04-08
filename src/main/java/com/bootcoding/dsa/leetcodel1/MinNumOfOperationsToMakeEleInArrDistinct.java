package com.bootcoding.dsa.leetcodel1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Leetcode Q-3396 WAP to Find Minimum Number of Operations to Make Elements in Array Distinct
You are given an integer array nums. You need to ensure that the elements in the array are distinct. To achieve this,
you can perform the following operation any number of times:
Remove 3 elements from the beginning of the array. If the array has fewer than 3 elements, remove all remaining elements.
Note that an empty array is considered to have distinct elements. Return the minimum number of operations needed to make
the elements in the array distinct.
 */
public class MinNumOfOperationsToMakeEleInArrDistinct {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,2,3,3,5,7};

        //Method Calling
        int result = minimumOperations(nums);
        System.out.println(result);
    }

    //Method Definition
    public static int minimumOperations(int[] nums) {

        int n = nums.length;
        int operations = 0;

        while (true){
            Set<Integer> set = new HashSet<>();
            boolean hasDuplicates = false;

            for(int i = 0; i < n; i++){
                if(!set.add(nums[i])){
                    hasDuplicates = true;
                    break;
                }
            }
            if(!hasDuplicates){
                return operations;
            }

            nums = removeFirst3(nums);
            n = nums.length;
            operations++;
        }
    }

    private static int[] removeFirst3(int[] nums) {
        if(nums.length <= 3){
            return new int[0];
        }
        return Arrays.copyOfRange(nums, 3, nums.length);
    }
}
