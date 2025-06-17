package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-367 WAP to Valid Perfect Square
Given a positive integer num, return true if num is a perfect square or false otherwise.
A perfect square is an integer that is the square of an integer. In other words,
it is the product of some integer with itself.
You must not use any built-in library function, such as sqrt.
 */
public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 16;
        //Method Calling
        boolean result = isPerfectSquare(num);
        System.out.println(result);
    }

    //Method Definition
    public static boolean isPerfectSquare(int num) {
        if(num < 2) return true;

        long left = 2;
        long right = num / 2;

        while(left <= right){
            long mid = left + (right - left) / 2;
            long guess = mid * mid;

            if (guess == num){
                return true;
            }else if(guess < num){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return false;
    }
}
