package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-485 WAP to find maximum consecutive ones
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        //Declare and initialize the array
        int[] nums = {1,1,0,1,1,1,0};
        //Method Calling
        int result = findMaxConsecutiveOnes(nums);
        System.out.println(result);
    }

    //Method definition
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==1){
                count++;
                max = Math.max(max, count);
            } else if (nums[i]==0) {
                count =0;
            }
        }
        return max;
    }
}
