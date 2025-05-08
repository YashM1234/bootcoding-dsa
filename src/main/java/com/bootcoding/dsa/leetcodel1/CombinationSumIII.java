package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayList;
import java.util.List;

/*
Leetcode Q-216 WAP for Combination Sum III
Find all valid combinations of k numbers that sum up to n such that the following conditions are true:
Only numbers 1 through 9 are used.
Each number is used at most once.
Return a list of all possible valid combinations. The list must not contain the same combination twice,
and the combinations may be returned in any order.
 */
public class CombinationSumIII {
    public static void main(String[] args) {
        int k = 3;
        int n = 7;
        //Method Calling
        List<List<Integer>> result = combinationSum3(k, n);
        System.out.println(result);

    }

    //Method Definition
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), k, n, 1);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> path, int k, int remain, int start){
        if(path.size() == k){
            if(remain == 0){
                result.add(new ArrayList<>(path));
            }
            return;
        }

        for(int i = start; i <= 9; i++){
            if(i > remain) break;

            path.add(i);
            backtrack(result, path, k, remain - i, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
