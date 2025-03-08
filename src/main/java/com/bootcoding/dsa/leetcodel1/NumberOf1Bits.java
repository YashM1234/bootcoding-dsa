package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-191 WAP to solve Number of 1 Bits
Given a positive integer n, write a function that returns
the number of set bits in its binary representation (also known as the Hamming weight).
 */
public class NumberOf1Bits {
    public static void main(String[] args) {
        int n = 11;
        //Method Calling
        int result = hammingWeight(n);
        System.out.println(result);
    }

    //Method Definition
    public static int hammingWeight(int n) {
        int result = 0;
        while (n > 0) {
            n = n & (n - 1);
            result++;
        }
        return result;

        //OR
//        int result = 0;
//        String bits = Integer.toBinaryString(n);
//        for(int i = 0; i < bits.length(); i++){
//            if(bits.charAt(i) == 49){
//                result = result + 1;
//            }
//        }
//        return result;

        //OR

//        return Integer.bitCount(n);
    }
}
