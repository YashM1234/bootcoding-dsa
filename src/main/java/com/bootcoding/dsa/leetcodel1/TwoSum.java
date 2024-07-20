package com.bootcoding.dsa.leetcodel1;

import java.util.HashMap;
import java.util.Map;

/* Leetcode Q-1 WAP to solve Two Sum problem
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        //Method Calling
        int[] res = twoSum(nums, target);
        for (int x : res){
            System.out.println(x);
        }
    }

    //Method definition
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int x = target - nums[i];
            if(map.containsKey(x)){
                result[0] = map.get(x);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return result;

        //OR

//        for(int i = 0; i < nums.length; i++){
//            for(int j = i + 1; j < nums.length; j++){
//                if(nums[i]+nums[j] == target){
//                    return new int[] {i , j};
//                }
//            }
//        }
//        return null;

        //OR

//        int[] result = new int[2];
//        for(int i = 0; i < nums.length-1; i++){
//            for(int j = i + 1; j < nums.length; j++){
//                if(nums[i]+nums[j] == target){
//                    result[0] = i;
//                    result[1] = j;
//                    return result;
//                }
//            }
//        }
//        return result;
    }
}
