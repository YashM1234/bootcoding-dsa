package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-219. WAP to find duplicate element and if it contains then print true for if i-j<=k
public class ArrayDuplicateElement2 {
    public static void main(String[] args) {
        //Declare and initialize the array
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        //Method Calling
        boolean bol = containsNearbyDuplicate(nums, k);
        System.out.println(bol);
    }

    //Method definition
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length && j <= k+i; j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
