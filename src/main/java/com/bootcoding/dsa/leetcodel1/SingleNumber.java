package com.bootcoding.dsa.leetcodel1;
import java.util.Arrays;

/* Leetcode Q-136 WAP for single number
Given a non-empty array of integers nums, every element
appears twice except for one. Find that single one.
You must implement a solution with a linear runtime
complexity and use only constant extra space.
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,1,4,1,4,5};
        //Method Calling
        int singleNum = singleNumber(nums);
        System.out.println(singleNum);
    }

    //Method Definition
    public static int singleNumber(int[] nums) {
        int element = 0;
        for(int x : nums){
            element = element ^ x;
        }
        return element;

        //OR

//        Arrays.sort(nums);
//        int element = 0;
//        if(nums.length == 1){
//            return nums[0];
//        }else{
//            int i = 0;
//            while (i != nums.length-1){
//                if(nums[i] == nums[i+1]){
//                    i++;
//                }else{
//                    element = nums[i];
//                    return element;
//                }
//                i++;
//            }
//        }
//        return nums[nums.length-1];
    }
}
