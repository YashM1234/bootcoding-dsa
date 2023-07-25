package com.bootcoding.dsa.leetcodel1;
/*Leetcode Q-70 WAP for climbing stairs
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct
ways can you climb to the top?
 */
public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;
        //Method calling
        int result = climbStairs(n);
        System.out.println(result);
    }

    //Method Definition
    public static int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        int one = 1;
        int two = 2;
        for(int i = 2; i < n; i++){
            int temp = one;
            one = two;
            two = temp + two;
        }
        return two;
    }
}
