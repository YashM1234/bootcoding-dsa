package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-153 WAP to Find Minimum in Rotated Sorted Array
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example,
the array nums = [0,1,2,4,5,6,7] might become:
[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array
[a[n-1], a[0], a[1], a[2], ..., a[n-2]].
Given the sorted rotated array nums of unique elements, return the minimum element of this array.
You must write an algorithm that runs in O(log n) time.
 */
public class FindMinInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        //Method Calling
        int result = findMin(nums);
        System.out.println(result);
    }
    //Method Definition
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left  < right){
            int mid  = left + (right - left) / 2;

            if(nums[mid] > nums[right]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }

        return nums[left];
    }
}
