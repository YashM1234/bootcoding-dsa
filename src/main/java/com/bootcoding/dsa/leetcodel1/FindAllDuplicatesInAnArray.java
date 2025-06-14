package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Leetcode Q-442 WAP to Find All Duplicates in an Array
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears
at most twice, return an array of all the integers that appears twice.
You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed
to store the output
 */
public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        //Method Calling
        List<Integer> result = findDuplicates(nums);
        System.out.println(result);
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> count = new HashMap<>();

        for(int key: nums){
           count.put(key, count.getOrDefault(key, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: count.entrySet()){
            if(entry.getValue() >= 2){
                result.add(entry.getKey());
            }
        }

        return result;
    }
}
