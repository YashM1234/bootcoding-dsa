package com.bootcoding.dsa.leetcodel1;
import java.util.ArrayList;
import java.util.List;
/* Leetcode Q-89 WAP for gray code
An n-bit gray code sequence is a sequence of 2n integers where:
Every integer is in the inclusive range [0, 2n - 1],
The first integer is 0,
An integer appears no more than once in the sequence,
The binary representation of every pair of adjacent integers differs by exactly one bit, and
The binary representation of the first and last integers differs by exactly one bit.
Given an integer n, return any valid n-bit gray code sequence.
 */
public class GrayCode {
    public static void main(String[] args) {
        int n = 2;
        //Method Calling
        List<Integer> grayCode = grayCode(n);
        System.out.println(grayCode);
    }
    //Method Definition
    public static List<Integer> grayCode(int n) {
        List<Integer> grayCode = new ArrayList<>();
        int code = 0;
        for(int i = 0; i < 1 << n; i++){ // Note: 1 << n = 1 * n ^(power) n
            code = code ^ i & (-i); // Note: if i = 3, i = 00000011 bitwise AND (&), -i = 11111101 , i & (-i) = 00000001
            grayCode.add(code);     // code XOR i & (-i) = 00000011 ^(XOR) 00000001 = 00000010

        }
        return grayCode;
    }
}
