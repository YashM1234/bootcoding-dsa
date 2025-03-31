package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-326 WAP to find give number is Power of three or not

Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.
 */
public class PowerOfThree {
    public static void main(String[] args) {
        int n = 27;
        //Method Calling
        boolean result = isPowerOfThree(n);
        System.out.println(result);
    }

    //Method Definition
    public static boolean isPowerOfThree(int n) {
        return (n > 0) && (1162261467 % n == 0);
    }
}
