package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-3300 WAP to find Minimum element After Replacement with digit sum
You are given an integer array nums.
You replace each element in nums with the sum of its digits.
Return the minimum element in nums after all replacements.
*/
public class MinElementAftRepWithDigitSum {
    public static void main(String[] args) {
        int[] nums = {999,19,199};
        //Method Calling
        int result = minElement(nums);
        System.out.println(result);
    }

    //Method Definition
    public static int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;

        for(int num: nums){
            int sum = 0;
            int temp = num;

            while(temp > 0){
                sum = sum + temp % 10;
                temp = temp / 10;
            }
            min = Math.min(min, sum);
        }
        return min;

        //OR

//        int min = Integer.MAX_VALUE;
//        int sum = 0;
//        for (int num : nums) {
//            String digit = Integer.toString(num);
//            for (int j = 0; j < digit.length(); j++) {
//                sum = sum + (digit.charAt(j) - '0');
//            }
//            if (min > sum) {
//                min = sum;
//            }
//            sum = 0;
//        }
//        return min;
    }
}
