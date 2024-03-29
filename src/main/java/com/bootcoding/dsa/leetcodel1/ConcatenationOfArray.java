package com.bootcoding.dsa.leetcodel1;
/*Leetcode Q-1929 WAP for concatenation of array
Given an integer array nums of length n, you want to create an array ans of length 2n
where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans.
 */
public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        //Method Calling
        int[] resultantArr = getConcatenation(nums);
        for(int x : resultantArr){
            System.out.println(x);
        }
    }

    //Method Definition
    public static int[] getConcatenation(int[] nums) {
        int length = 2 * nums.length;
        int[] arr = new int[length];
        for(int i = 0, j = 0; i < length; i++){
            arr[i] = nums[j++];
            if(j == nums.length){
                j = 0;
            }
        }
        return arr;
    }
}
