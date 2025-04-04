package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-2864 WAP to find Maximum Odd Binary Number
You are given a binary string s that contains at least one '1'.
You have to rearrange the bits in such a way that the resulting binary number is the maximum odd binary number
that can be created from this combination.
Return a string representing the maximum odd binary number that can be created from the given combination.
Note that the resulting string can have leading zeros.
 */
public class MaxOddBinaryNumber {
    public static void main(String[] args) {
        String s = "0111";
        //Method Calling
        String result = maximumOddBinaryNumber(s);
        System.out.println(result);
    }

    //Method Definition
    public static String maximumOddBinaryNumber(String s) {
        int oneCount = 0;

        for(char c: s.toCharArray()){
            if(c == '1') oneCount++;
        }

        return "1".repeat(oneCount - 1) + "0".repeat(s.length() - oneCount) + "1";
    }
}
