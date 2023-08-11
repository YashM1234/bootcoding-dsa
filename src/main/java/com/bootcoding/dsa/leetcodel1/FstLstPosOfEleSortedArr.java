package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-34 WAP to find first and last position of element in a sorted array
Given an array of integers nums sorted in non-decreasing order,
find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
 */
public class FstLstPosOfEleSortedArr {
    public static void main(String[] args) {
        //Declare and initialize the array
        int[] nums = {5,7,7,8,8,8,10};
        int target = 8;
        //Method Calling
        int[] result = searchRange(nums,target);
        for(int x : result){
            System.out.println(x);
        }
    }

    //Method definition
    public static int[] searchRange(int[] nums, int target) {
        //If array is unsorted
        if(nums.length == 0){
            return new int[]{-1,-1};
        }
        int count = 0;
        int[] position = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                position[0] = i;
                count = i;
                break;
            }
            else if(i == nums.length-1){
                return new int[]{-1, -1};
            }
        }
        for(int i = nums.length-1; i >= count; i--){
            if(nums[i] == target){
                position[1] = i;
                break;
            }
        }
        return position;

        //OR
        //If array is sorted fast solution
//        if(nums.length == 0){
//            return new int[]{-1,-1};
//        }
//        int[] position = new int[2];
//        position[0] = search(nums, target, 0);
//        position[1] = search(nums,target,1);
//        return position;
//    }
//    public static int search(int[] nums, int target, int pos){
//        int x = -1;
//        int low = 0;
//        int high = nums.length-1;
//        while (low <= high){
//            int mid = (low+high)/2;
//            if(target < nums[mid]){
//                high = mid - 1;
//            }
//            else if(target > nums[mid]){
//                low = mid + 1;
//            }
//            else{
//                x = mid;
//                if(pos == 0){
//                    high = mid - 1;
//                }
//                else{
//                    low = mid + 1;
//                }
//            }
//        }
//        return x;
    }
}

