package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-3370 WAP to find Smallest Number With All Set Bits
You are given a positive number n.

Return the smallest number x greater than or equal to n, such that
the binary representation of x contains only set bits
*/
public class SmallestNumberWithAllSetBits {
    public static void main(String[] args) {
        int n = 10;
        //Method Calling
        int result = smallestNumber(n);
        System.out.println(result);
    }

    //Method Definition
    public static int smallestNumber(int n) {
        String binary = Integer.toBinaryString(n).replace('0', '1');
        return Integer.parseInt(binary, 2);
    }
}