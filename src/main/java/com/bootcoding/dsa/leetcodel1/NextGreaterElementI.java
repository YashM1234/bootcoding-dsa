package com.bootcoding.dsa.leetcodel1;

import java.util.Arrays;

/*
Leetcode Q-496 WAP for Next Greater Element I
The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine
the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
 */
public class NextGreaterElementI {
    public static void main(String[] args) {
        int[] num1 = {2, 4};
        int[] num2 = {1, 2, 3, 4};

        //Method Calling
        int[] ans = nextGreaterElement(num1, num2);
        System.out.println(Arrays.toString(ans));
    }

    //Method Definition
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int temp = nums1[i];
            for(int j = 0; j < nums2.length; j++){
                if(temp == nums2[j]){
                    if(j + 1 == nums2.length){
                        ans[i] = -1;
                        break;
                    }else{
                        int flag = 0;
                        for(int k = j + 1; k < nums2.length; k++){
                            if(nums2[k] > nums2[j]){
                                ans[i] = nums2[k];
                                flag = 1;
                                break;
                            }
                        }
                        if(flag == 0){
                            ans[i] = -1;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
