package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-1512 WAP to count number of good pair
public class GoodPairCount {
    public static void main(String[] args) {
        //Declare and initialize the array
        int[] nums = {1,2, 2, 1};
        //Method Calling
        int result = numIdenticalPairs(nums);
        System.out.println(result);
    }

    //Method definition
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        int[] arr = new int[101];
        for(int x : nums){
            count = count + arr[x]++;
        }
        return count;
        //OR
//        int count = 0;
//        for(int i = 0; i < nums.length-1; i++){
//            for(int j = i+1; j < nums.length; j++){
//                if(nums[i]==nums[j]){
//                    count++;
//                }
//            }
//        }
//        return count;
    }
}
