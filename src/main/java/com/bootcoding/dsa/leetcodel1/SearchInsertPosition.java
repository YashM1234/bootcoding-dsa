package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-35 WAP to search insert position in an array
Given a sorted array of distinct integers and a target value,
return the index if the target is found. If not, return the
index where it would be if it were inserted in order.
 */
public class SearchInsertPosition {
    public static void main(String[] args) {

    //Declare and initialize the array
    int[] nums = {1,3,4,5};
    int target = 6;
    //Method Calling
    int result = searchInsert(nums,target);
    System.out.println(result);
}

    //Method definition
    public static int searchInsert(int[] nums, int target) {
        int index = nums.length;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target){
                index = i;
                break;
            }
        }
        return index;

        //OR

//        for(int i = 0; i < nums.length; i++){
//            if(nums[i]==target){
//                return i;
//            }
//            else if(nums[i] < target && i == nums.length-1 || nums[i] < target && nums[i+1] > target){
//                return ++i;
//            }
//        }
//        return 0;
    }
}
