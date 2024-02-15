package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-1295. WAP to find numbers with even number of digits
//In this, we don't convert integer into string instead we count digits of given number using division approach.
public class NumbersWithEvenDigitCountM2 {
    public static void main(String[] args) {
        //Declare and initialise array
        int[] nums = {123, 58, 999, 9999, 4};
        //Method calling
        int totalCount = findNumbers(nums);
        System.out.println(totalCount);
    }
    //Method to count the even digit numbers in an array
    public static int findNumbers(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            //Check is given number digits are even if even then increment count by 1
            if(countDigit(nums[i])%2 == 0){
                count++;
            }
        }
        return count;
    }
    //Method to count the digits in given number
    public static int countDigit(int nums){
        int digitCount = 0;
        while(nums != 0){
            nums = nums/10;
            digitCount++;
        }
        return digitCount;
    }
}
