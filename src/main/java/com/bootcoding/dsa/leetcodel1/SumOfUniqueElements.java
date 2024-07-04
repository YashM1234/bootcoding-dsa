package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-1748 WAP to find the sum of unique element in an array
//Condition: 1 <= nums.length <= 100  and  1 <= nums[i] <= 100
public class SumOfUniqueElements {
    public static void main(String[] args) {
        //Declare and initialise an array
        int[] nums = {1,2,1,4,10};
        //Method Calling
        int uniqueSum = sumOfUnique(nums);
        System.out.println(uniqueSum);
    }

    //Method Definition
    public static int sumOfUnique(int[] nums) {
        int sum = 0;
        int[] tempArr = new int[101];
        for (int num : nums) {
            tempArr[num] += 1;
        }
        for(int i = 0; i < tempArr.length; i++){
            if(tempArr[i] == 1){
                sum = sum + i;
            }
        }
        return sum;
    }
}
