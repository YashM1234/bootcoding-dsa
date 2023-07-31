package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-2529. Maximum count of positive integer and negative integer, print only maximum count out of them
public class CountMaximumPosNegInteger {
    public static void main(String[] args) {
        //Declaring input array of length user input
        int[] nums = new int[args.length];
        //Taking input from user for an array of name nums
        for(int i = 0; i < args.length; i++){
            String value = args[i];
            int a = Integer.parseInt(value);
            nums[i] = a;
        }
        //Calling method maximumCount, maximum holds the return value by the method
        int maximum = maximumCount(nums);
        System.out.println(maximum);

    }
    //Method Definition
    public static int maximumCount(int[] nums) {
        int posCount = 0;
        int negCount = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                posCount++;
            }
            else if(nums[i] < 0){
                negCount++;
            }
        }
        /*
            // 1. Using if-else
            if(posCount > negCount){
               return posCount;
               }
             else{
                return negCount;
                }
        */

        /*
        //2. Use Ternary Operator to shorthand if-else statement
            int maxCount;
            return maxCount = posCount > negCount ? posCount : negCount;
         */

        //3. Use Math.max() method to find maximum out of two
        int maxCount;
        return maxCount = Math.max(posCount, negCount);
    }
}
