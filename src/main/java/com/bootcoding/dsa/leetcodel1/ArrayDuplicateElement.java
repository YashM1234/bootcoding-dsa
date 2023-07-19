package com.bootcoding.dsa.leetcodel1;
import java.util.Arrays;
//Leetcode Q-217.WAP to check does array Contains Duplicate element
public class ArrayDuplicateElement {
    public static void main(String[] args) {
        //Declare and initialize the array
        int[] nums = {1, 2, 3, 9, 2};
        //Method Calling
        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }

    //Method definition
    public static boolean containsDuplicate(int[] nums) {
        //sort array
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}

