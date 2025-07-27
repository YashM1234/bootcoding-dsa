package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-504 WAP to convert into Base 7
Given an integer num, return a string of its base 7 representation.
 */
public class Base7 {
    public static void main(String[] args) {
        int num = 100;
        //Method Calling
        String result = convertToBase7(num);
        System.out.println(result);
    }

    //Method Definition
    public static String convertToBase7(int num) {
        if(num == 0) return "0";

        boolean isNegative = num < 0;
        num = Math.abs(num);

        StringBuilder sb = new StringBuilder();

        while(num > 0){
            sb.append(num % 7);
            num /= 7;
        }

        if(isNegative) sb.append('-');

        return sb.reverse().toString();
    }
}
