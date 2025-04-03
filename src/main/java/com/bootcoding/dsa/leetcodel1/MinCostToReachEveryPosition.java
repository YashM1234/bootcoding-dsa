package com.bootcoding.dsa.leetcodel1;

import java.util.Arrays;

/*
Leetcode Q-3502 WAP to find Minimum Cost To Reach Every Position
You are given an integer array cost of size n. You are currently
at position n (at the end of the line) in a line of n + 1 people (numbered from 0 to n).
You wish to move forward in the line, but each person in front of you charges
a specific amount to swap places. The cost to swap with person i is given by cost[i].
You are allowed to swap places with people as follows:
If they are in front of you, you must pay them cost[i] to swap with them.
If they are behind you, they can swap with you for free.
Return an array answer of size n, where answer[i] is the minimum total cost to reach each position i in the line.
*/
public class MinCostToReachEveryPosition {
    public static void main(String[] args) {
        int[] cost = {5,3,4,1,3,2};

        //Method Calling
        int[] result = minCosts(cost);
        System.out.println(Arrays.toString(result));
    }

    //Method Definition
    public static int[] minCosts(int[] cost) {
        int[] result = new int[cost.length];
        for(int i = 0; i < cost.length; i++){
            result[i] = Math.min(i > 0 ? result[i - 1] : Integer.MAX_VALUE, cost[i]);
        }
        return result;
    }
}
