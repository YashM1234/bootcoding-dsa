package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-3232 WAP to Find if Digit Game Can Be Won
You are given an array of positive integers nums.
Alice and Bob are playing a game. In the game, Alice can choose either all single-digit numbers or
all double-digit numbers from nums, and the rest of the numbers are given to Bob. Alice wins if the
sum of her numbers is strictly greater than the sum of Bob's numbers.
Return true if Alice can win this game, otherwise, return false.
 */
public class FindIfDigitGameCanBeWon {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,14};
        //Method Calling
        boolean result = canAliceWin(nums);
        System.out.println(result);
    }

    //Method Definition
    public static boolean canAliceWin(int[] nums) {
        int singleSum  = 0;
        int doubleSum = 0;

        for(int num: nums){
            if(num < 10){
                singleSum  += num;
            }else{
                doubleSum += num;
            }
        }
        return singleSum  > doubleSum || singleSum < doubleSum;
    }
}
