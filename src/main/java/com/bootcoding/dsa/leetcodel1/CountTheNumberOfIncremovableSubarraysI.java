package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-2970 WAP to Count The Number Of Incremovable Subarrays I
You are given a 0-indexed array of positive integers nums.
A subarray of nums is called incremovable if nums becomes strictly increasing on removing the subarray.
For example, the subarray [3, 4] is an incremovable subarray of [5, 3, 4, 6, 7] because removing this
subarray changes the array [5, 3, 4, 6, 7] to [5, 6, 7] which is strictly increasing.
Return the total number of incremovable subarrays of nums.
Note that an empty array is considered strictly increasing.
A subarray is a contiguous non-empty sequence of elements within an array.
 */
public class CountTheNumberOfIncremovableSubarraysI {
    public static void main(String[] args) {
        int[] nums = {6,5,7,8};
        //Method Definition
        int result = incremovableSubarrayCount(nums);
        System.out.println(result);
    }

    //Method Definition
    public static int incremovableSubarrayCount(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int[] newArray = new int[n - (j - i + 1)];
                int index = 0;

                for (int k = 0; k < n; k++) {
                    if (k < i || k > j) {
                        newArray[index++] = nums[k];
                    }
                }

                if (isStrictlyIncreasing(newArray)) {
                    count++;
                }
            }
        }

        return count;
    }

    private static boolean isStrictlyIncreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
