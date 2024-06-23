package com.bootcoding.dsa.leetcodel1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Leetcode Q-90 WAP to find subset II
Given an integer array nums that may contain duplicates, return all possible subsets
(the power set).
The solution set must not contain duplicate subsets. Return the solution in any order
 */
public class SubsetII {
    public static void main(String[] args) {
        int[] nums = {4, 4, 4, 1, 4};
        SubsetsIISolution subsetsIISolution = new SubsetsIISolution();
        //Method Calling
        List<List<Integer>> subsets = subsetsIISolution.subsetsWithDup(nums);
        System.out.println(subsets);
    }
}
//Class containing all logic to calculate subsets of given duplicate number array
class SubsetsIISolution {
    List<List<Integer>> finalSubsets;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        finalSubsets = new ArrayList<>();
        getSubsets(0, new ArrayList<>(), nums);
        return finalSubsets;
    }

    private void getSubsets(int start, ArrayList<Integer> current, int[] nums){
        finalSubsets.add(new ArrayList<>(current));
        for(int i = start; i < nums.length; i++){
            if(i != start && nums[i] == nums[i - 1]){
                continue;
            }
            current.add(nums[i]);
            getSubsets(i + 1, current, nums);
            current.remove(current.size() - 1);
        }
    }
}
