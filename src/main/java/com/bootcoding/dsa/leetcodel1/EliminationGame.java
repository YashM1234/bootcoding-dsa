package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-390 WAP for Elimination Game
You have a list arr of all integers in the range [1, n] sorted in a strictly increasing order.
Apply the following algorithm on arr:
Starting from left to right, remove the first number and every other number afterward until you reach
the end of the list.
Repeat the previous step again, but this time from right to left, remove the rightmost number and every
other number from the remaining numbers.
Keep repeating the steps again, alternating left to right and right to left, until a single number remains.
Given the integer n, return the last number that remains in arr.
 */
public class EliminationGame {
    public static void main(String[] args) {
        int n = 9;
        //Method Calling
        int output = lastRemaining(n);
        System.out.println(output);
    }
    //Method Definition
    public static int lastRemaining(int n) {
        int head = 1;
        int step = 1;
        int remaining = n;
        boolean left = true;

        while(remaining > 1){
            if(left || remaining % 2 == 1){
                head += step;
            }
            step *= 2;
            remaining /= 2;
            left = !left;
        }

        return head;
    }
}
