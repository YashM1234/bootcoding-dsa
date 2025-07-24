package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-400 WAP to return Nth Digit
Given an integer n, return the nth digit of the infinite integer sequence
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...].
 */
public class NthDigit {
    public static void main(String[] args) {
        int n = 11;
        //Method Calling
        int result = findNthDigit(n);
        System.out.println(result);
    }

    //Method Definition
    public static int findNthDigit(int n) {
        int length = 1;
        long count = 9;
        int start = 1;

        while(n > length * count){
            n -= length * count;
            length++;
            count *= 10;
            start *= 10;
        }

        int number = start + (n - 1) / length;

        String numStr = Integer.toString(number);
        return Character.getNumericValue(numStr.charAt((n - 1) % length));
    }
}
