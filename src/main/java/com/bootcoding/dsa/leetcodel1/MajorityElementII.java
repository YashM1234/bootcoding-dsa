package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayList;
import java.util.List;

/*
Leetcode Q-229 WAP for Majority Element II
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 */
public class MajorityElementII {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 2, 2, 2};
        //Method Calling
        List<Integer> result  = majorityElement(nums);
        System.out.println(result);
    }

    //Method Definition
    public static List<Integer> majorityElement(int[] nums) {
        int candidate1 = 0;
        int candidate2 = 1;
        int count1 = 0;
        int count2 = 0;

        for(int num: nums){
            if(num == candidate1){
                count1++;
            }else if(num == candidate2){
                count2++;
            }else if(count1 == 0){
                candidate1 = num;
                count1 = 1;
            }else if(count2 == 0){
                candidate2 = num;
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for(int num: nums){
            if(num == candidate1) count1++;
            else if(num == candidate2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        int threshold = nums.length/3;
        if(count1 > threshold) result.add(candidate1);
        if(count2 > threshold) result.add(candidate2);

        return result;
    }
}
