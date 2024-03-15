package com.bootcoding.dsa.leetcodel1;
import java.util.ArrayList;
import java.util.List;
//Leetcode Q-46 WAP to find the permutations of given array
public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        //Method Calling
        List<List<Integer>> permute = permute(nums);
        for(List<Integer> combination: permute){
            System.out.println(combination);
        }
    }

    //Method Definition
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permute = new ArrayList<>();
        permutations(new ArrayList<>(), permute, nums);
        return permute;
    }

    private static void permutations(ArrayList<Integer> newPermute, List<List<Integer>> permute, int[] nums) {
        if(newPermute.size() == nums.length){
            permute.add(new ArrayList<>(newPermute));
            return;
        }

        for(int num: nums){
            if(!newPermute.contains(num)){
                newPermute.add(num);
                permutations(newPermute, permute, nums);
                newPermute.remove(newPermute.size() - 1);
            }
        }
    }
}
