package com.bootcoding.dsa.leetcodel1;
import java.util.ArrayList;
import java.util.List;
/* Leetcode Q-78 WAP to find the subsets of given array
Given an integer array nums of unique elements, return all possible
subsets(the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.
 */
public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        //Method Calling
        SubsetsSolution subsetsSolution = new SubsetsSolution();
        List<List<Integer>> subsets =subsetsSolution. subsets(nums);
        System.out.println(subsets);
    }
}
//Class containing all logic to calculate subsets of given array
class SubsetsSolution {
    List<List<Integer>> finalSubset;
    int length;
    public List<List<Integer>> subsets(int[] nums) {
        finalSubset = new ArrayList<>();
        for(length = 0; length <= nums.length; length++) {
            getSubsets(0, new ArrayList<Integer>(), nums);
        }
        return finalSubset;
    }

    private void getSubsets(int start, ArrayList<Integer> current, int[] nums){
        if(current.size() == length){
            finalSubset.add(new ArrayList<>(current));
            return;
        }
        for(int i = start; i < nums.length; i++){
            current.add(nums[i]);
            getSubsets(i + 1, current, nums);
            current.remove(current.size() - 1);
        }
    }
}
