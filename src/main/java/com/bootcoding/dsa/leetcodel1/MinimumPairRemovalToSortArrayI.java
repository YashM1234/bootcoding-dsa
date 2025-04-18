package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-3507 WAP to Minimum Pair Removal To Sort Array I
Given an array nums, you can perform the following operation any number of times:
Select the adjacent pair with the minimum sum in nums. If multiple such pairs exist, choose the leftmost one.
Replace the pair with their sum.
Return the minimum number of operations needed to make the array non-decreasing.
An array is said to be non-decreasing if each element is greater than or equal to its previous element (if it exists).
 */
public class MinimumPairRemovalToSortArrayI {
    public static void main(String[] args) {
        int[] nums = {1,2,2,2,2,1,3};
        //Method Calling
        int result = minimumPairRemoval(nums);
        System.out.println(result);
    }

    //Method Definition
    public static int minimumPairRemoval(int[] nums) {
        int length = nums.length;
        int count = 0;

        while (length > 1) {
            boolean isSorted = true;
            int minSum = Integer.MAX_VALUE;
            int minIndex = -1;

            // Find the pair with the minimum sum and check if array is sorted
            for (int i = 0; i < length - 1; i++) {
                if (nums[i] > nums[i + 1]) isSorted = false;
                int sum = nums[i] + nums[i + 1];
                if (sum < minSum) {
                    minSum = sum;
                    minIndex = i;
                }
            }

            if (isSorted) break;

            // Merge the minimum pair
            nums[minIndex] = minSum;
            for (int i = minIndex + 1; i < length - 1; i++) {
                nums[i] = nums[i + 1];
            }

            length--;
            count++;
        }

        return count;
    }
}
