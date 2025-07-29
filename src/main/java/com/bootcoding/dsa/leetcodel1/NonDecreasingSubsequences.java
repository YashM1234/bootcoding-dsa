package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Leetcode Q-491 WAP to return all different possible Non-decreasing Subsequences
Given an integer array nums, return all the different possible non-decreasing subsequences of the given array with
at least two elements. You may return the answer in any order.
 */
public class NonDecreasingSubsequences {
    public static void main(String[] args) {
        int[] num = {4,6,7,7};
        //Method Calling
        List<List<Integer>> result = findSubsequences(num);
        System.out.println(result);
    }

    //Method Definition
    public static List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    //Helper Method
    private static void backtrack(int start, int[] nums, List<Integer> path, List<List<Integer>> result){
        if(path.size() >= 2){
            result.add(new ArrayList<>(path));
        }

        Set<Integer> used = new HashSet<>();

        for(int i = start; i < nums.length; i++){
            if(!path.isEmpty() && nums[i] < path.get(path.size() - 1)){
                continue;
            }
            if(used.contains(nums[i])){
                continue;
            }

            used.add(nums[i]);
            path.add(nums[i]);
            backtrack(i + 1, nums, path, result);
            path.remove(path.size() - 1);
        }
    }
}
