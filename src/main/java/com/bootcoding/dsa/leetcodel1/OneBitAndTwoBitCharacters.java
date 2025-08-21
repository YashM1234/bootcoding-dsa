package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-3498 WAP for 1-bit and 2-bit Characters
We have two special characters:
The first character can be represented by one bit 0.
The second character can be represented by two bits (10 or 11).
Given a binary array bits that ends with 0, return true if the last character must be a one-bit character.
 */
public class OneBitAndTwoBitCharacters {
    public static void main(String[] args) {
        int[] bits = {1, 0, 0};
        //Method Calling
        boolean result = isOneBitCharacter(bits);
        System.out.println(result);
    }

    //Method Definition
    public static boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        int n = bits.length;

        while( i < n - 1){
            if(bits[i] == 1){
                i += 2;
            }else{
                i += 1;
            }
        }

        return i == n - 1;
    }
}
