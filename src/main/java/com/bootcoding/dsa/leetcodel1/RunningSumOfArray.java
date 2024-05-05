package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-1480. WAP for running sum of 1d Array
public class RunningSumOfArray {
    public static void main(String[] args) {
        //Creating new array to store user input
        int[] nums = new int[args.length];
        //Taking input as an array from user
        for(int i = 0; i < args.length; i++){
            String values = args[i];
             nums[i] = Integer.parseInt(values);
        }

        //Creating array to store result return by runningSum() method
        int[] result = new int[nums.length];
        //Method Calling
        result = runningSum(nums);
        //Print resultant array
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
    //Method definition
    public static int[] runningSum(int[] nums) {
        for(int i = 0; i < nums.length-1; i++){
            nums[i+1] = nums[i] + nums[i+1];
        }
        return nums;
    }
}
