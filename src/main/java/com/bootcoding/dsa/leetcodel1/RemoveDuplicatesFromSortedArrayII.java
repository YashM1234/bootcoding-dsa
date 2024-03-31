package com.bootcoding.dsa.leetcodel1;
// Leetcode Q-80 WAP to remove duplicates from sorted array II
public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        //Method Calling
        int k = removeDuplicates(nums);
        System.out.println(k);
    }
    //Method Definition
    public static int removeDuplicates(int[] nums) {
        if(nums.length < 3){
            return nums.length;
        }
        int k = 2;
        for(int i = 2; i < nums.length; i++){
           if(nums[i] != nums[k - 2]){
               nums[k] = nums[i];
               k++;
           }
        }
        return k;
    }
}
