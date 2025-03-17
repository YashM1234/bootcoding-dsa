package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-3411 WAP to find Maximum SubArray With Equal Products
You are given an array of positive integers nums.

An array arr is called product equivalent if prod(arr) == lcm(arr) * gcd(arr), where:

prod(arr) is the product of all elements of arr.
gcd(arr) is the GCD of all elements of arr.
lcm(arr) is the LCM of all elements of arr.
Return the length of the longest product equivalent subarray of nums.
*/
public class MaxSubArrWithEquProducts {
    public static void main(String[] args) {
        int[] nums = {4, 8, 10, 5};
        //Method Calling
        int result = maxLength(nums);
        System.out.println(result);

    }

    //Method Definition
    public static int maxLength(int[] nums) {
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            int gcd = nums[i];
            int lcm = nums[i];
            int product = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                product *= nums[j];
                gcd = computeGCD(gcd, nums[j]);
                lcm = computeLCM(lcm, nums[j]);

                if (product == lcm * gcd) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }

    private static int computeGCD(int a, int b){
        return (b == 0) ? a : computeGCD(b, a % b);
    }

    private static int computeLCM(int a, int b) {
        return (a / computeGCD(a, b)) * b;
    }
}
