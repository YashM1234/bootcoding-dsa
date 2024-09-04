package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-1493 WAP for Longest Subarray of 1's After Deleting One Element
Given a binary array nums, you should delete one element from it.
Return the size of the longest non-empty subarray containing only
1's in the resulting array. Return 0 if there is no such subarray.
 */
public class LongestSubArr1AftDel1Ele {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,0,1,1,0,1};
        //Method Calling
        int sizeOfSubArr = longestSubarray(nums);
        System.out.println(sizeOfSubArr);
    }

    //Method Definition
    public static int longestSubarray(int[] nums) {
        int start = 0;
        int zeroCount = 0;
        int maxWindow = 0;

        for(int i = 0; i < nums.length; i++) {
            zeroCount = zeroCount + (nums[i] == 0 ? 1 : 0);

            while (zeroCount > 1) {
                zeroCount = zeroCount - (nums[start] == 0 ? 1 : 0);
                start++;
            }
            maxWindow = Math.max(maxWindow, i - start);
        }
        return maxWindow;
    }
}
