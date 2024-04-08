package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-7 WAP to reverse integer
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit
integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers
(signed or unsigned).
 */
public class ReverseInteger {
    public static void main(String[] args) {
        int x = -3260985;
        //Method calling
        int reverseX = reverse(x);
        System.out.println(reverseX);
    }

    //Method Definition
    public static int reverse(int x) {
        long reverse = 0;
        while(x!=0){
            reverse = reverse*10 + x%10;
            x = x/10;
        }
        if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
            return 0;
        }
        return (int) reverse;
    }
}
