package com.bootcoding.dsa.leetcodel1;
/*
Leetcode Q-724 WAP to find the pivot index
Given an array of integers nums, calculate the pivot index of this array.
The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to
the sum of all the numbers strictly to the index's right.
If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the
left. This also applies to the right edge of the array.
Return the leftmost pivot index. If no such index exists, return -1.
 */
public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        //Method Calling
        int pIndex = pivotIndex(nums);
        System.out.println(pIndex);
    }

    //Method Definition
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int lSum = 0;
        for(int num: nums){
            sum += num;
        }
        for(int i = 0; i < nums.length; i++) {
            if(lSum == sum - lSum - nums[i]) {
                return i;
            }
            lSum += nums[i];
        }
        return -1;

        //OR

//        int index = -1;
//        int lSum = 0;
//        int rSum = 0;
//
//        for (int i = 0; i < nums.length; i++){
//            for(int j = i - 1; j >= 0; j--){
//                lSum += nums[j];
//            }
//            for (int j = i + 1; j < nums.length; j++){
//                rSum += nums[j];
//            }
//            if(lSum == rSum){
//                index = i;
//                break;
//            }
//            lSum = 0;
//            rSum = 0;
//        }
//        return index;
    }
}
