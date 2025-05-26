package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-81 WAP to Search in Rotated Sorted Array II
There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).
Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length)
such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].
Given the array nums after the rotation and an integer target, return true if target is in nums, or false
if it is not in nums.
You must decrease the overall operation steps as much as possible.
 */
public class SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        int target = 3;

        //Method Calling
        boolean result  = search(nums, target);
        System.out.println(result);
    }
    //Method Definition
    public static boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target) return true;

            if(nums[left] == nums[mid] && nums[mid] == nums[right]){
                left++;
                right--;
            }else if(nums[left] <= nums[mid]){
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                if(nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }

        return false;
    }
}
