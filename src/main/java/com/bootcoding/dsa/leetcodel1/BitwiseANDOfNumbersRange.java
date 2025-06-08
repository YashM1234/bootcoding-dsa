package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-201 WAP to Find Bitwise AND of Numbers Range
Given two integers left and right that represent the range [left, right], return
the bitwise AND of all numbers in this range, inclusive.
 */
public class BitwiseANDOfNumbersRange {
    public static void main(String[] args) {
        int left = 5;
        int right = 7;
        //Method Calling
        int result = rangeBitwiseAnd(left, right);
        System.out.println(result);
    }
    //Method Definition
    public static int rangeBitwiseAnd(int left, int right) {
        int shift = 0;

        while(left < right){
            left >>= 1;
            right >>= 1;
            shift++;
        }
        return left << shift;
    }
}
