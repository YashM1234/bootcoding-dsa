package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayList;
import java.util.List;

/*
Leetcode Q-39 WAP to find Combination Sum
Given an array of distinct integers candidates and a target integer target,
return a list of all unique combinations of candidates where the chosen numbers sum to target.
You may return the combinations in any order.
The same number may be chosen from candidates an unlimited number of times.
Two combinations are unique if the frequency of at least one of the chosen numbers is different.
The test cases are generated such that the number of unique combinations that
sum up to target is less than 150 combinations for the given input.
 */
public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        //Method Calling
        List<List<Integer>> result = combinationSum(candidates, target);
        System.out.println(result);
    }

    //Method Definition
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] candidates, int target, int index, List<Integer> current, List<List<Integer>> result) {
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        if(target < 0 || index >= candidates.length) return;

        current.add(candidates[index]);
        backtrack(candidates, target - candidates[index], index, current, result);
        current.remove(current.size() - 1);

        backtrack(candidates, target, index + 1, current, result);
    }

}
