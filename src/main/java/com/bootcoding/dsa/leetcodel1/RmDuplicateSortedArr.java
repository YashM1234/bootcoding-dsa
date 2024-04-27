package com.bootcoding.dsa.leetcodel1;
/*Leetcode Q-26 WAP to remove duplicates from sorted array
Given an integer array nums sorted in non-decreasing order,
remove the duplicates in-place such that each unique element
appears only once. The relative order of the elements should
be kept the same. Then return the number of unique elements
in nums.
 */
public class RmDuplicateSortedArr {
    public static void main(String[] args) {
        //Declare and initialize the array
        int[] nums = {1, 1, 2, 5, 7, 7, 8, 8, 8, 9};
        //Method Calling
        int k = removeDuplicates(nums);
        System.out.println(k);
    }

    //Method definition
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[count]!=nums[i]){
                count++;
                nums[count]=nums[i];
            }
        }
        return count+1;
    }
}
