package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-693 WAP for Binary Number With Alternating Bits
Given a positive integer, check whether it has alternating bits: namely,
if two adjacent bits will always have different values.
 */
public class BinaryNumberWithAlternatingBits {
    public static void main(String[] args) {
        int n = 7;
        //Method Calling
        boolean result = hasAlternatingBits(n);
        System.out.println(result);
    }

    //Method Definition
    public static boolean hasAlternatingBits(int n) {
        int x = n ^ (n >> 1);

        return (x & ( x + 1)) == 0;
    }
}
