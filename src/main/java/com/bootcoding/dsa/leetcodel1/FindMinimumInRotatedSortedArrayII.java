package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-154 WAP to Find Minimum in Rotated Sorted Array II
Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
For example, the array nums = [0,1,4,4,5,6,7] might become:
[4,5,6,7,0,1,4] if it was rotated 4 times.
[0,1,4,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array
[a[n-1], a[0], a[1], a[2], ..., a[n-2]].
Given the sorted rotated array nums that may contain duplicates, return the minimum element of this array.
You must decrease the overall operation steps as much as possible.
 */
public class FindMinimumInRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5};
        //Method Calling
        int result = findMin(nums);
        System.out.println(result);
    }
    //Method Definition
    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while(low < high){
            int mid = low + (high - low) / 2;

            if(nums[mid] < nums[high]){
                high = mid;
            }else if(nums[mid] > nums[high]){
                low = mid + 1;
            }else{
                high--;
            }
        }
        return nums[low];
    }
}
