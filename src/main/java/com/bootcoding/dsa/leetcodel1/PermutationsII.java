package com.bootcoding.dsa.leetcodel1;
import java.util.*;

//Leetcode Q-47 WAP to solve permutations
public class PermutationsII {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        PermuteUniqueSolution permuteUniqueSolution = new PermuteUniqueSolution();
        List<List<Integer>> uniquePermutations = permuteUniqueSolution.permuteUnique(nums);
        System.out.println(uniquePermutations);
    }
}

//class containing logic to find the unique permutation
class PermuteUniqueSolution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] check = new boolean[nums.length];
        List<List<Integer>> permute = new ArrayList<>();
        permutations(new ArrayList<>(), permute, check, nums);
        return permute;
    }

    private static void permutations(ArrayList<Integer> newPermute, List<List<Integer>> permute, boolean[] check, int[] nums) {
        if(newPermute.size() == nums.length){
            permute.add(new ArrayList<>(newPermute));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(check[i] || (i > 0 && nums[i - 1] == nums[i] && !check[i - 1])){
                continue;
            }
            newPermute.add(nums[i]);
            check[i] = true;
            permutations(newPermute, permute, check,  nums);
            newPermute.remove(newPermute.size() - 1);
            check[i] = false;
        }
    }
}

