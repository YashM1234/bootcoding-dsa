package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-704 WAP for binary search
Given an array of integers nums which is sorted in ascending order,
and an integer target, write a function to search target in nums.
If target exists, then return its index. Otherwise, return -1.
 */
public class BinarySearch {
    public static void main(String[] args) {
        //Declare and initialised sorted array
        int[] nums = {-1,0,3,5,9,12};
        int target = 12;
        //Method Calling
        int index = search(nums,target);
        System.out.println(index);
    }

    //Method Definition
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while(low <= high){

            int mid = (low + high)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
}
