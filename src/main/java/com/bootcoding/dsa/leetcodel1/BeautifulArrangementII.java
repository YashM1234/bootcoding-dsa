package com.bootcoding.dsa.leetcodel1;

import java.util.Arrays;

/*
Leetcode Q-667 WAP for Beautiful Arrangement II
Given two integers n and k, construct a list answer that contains n different positive integers
\ranging from 1 to n and obeys the following requirement:
Suppose this list is answer = [a1, a2, a3, ... , an], then the list [|a1 - a2|, |a2 - a3|,
|a3 - a4|, ... , |an-1 - an|] has exactly k distinct integers.
Return the list answer. If there multiple valid answers, return any of them.
 */
public class BeautifulArrangementII {
    public static void main(String[] args) {
        int n = 3;
        int k = 2;
        //Method calling
        int[] result = constructArray(n, k);
        System.out.println(Arrays.toString(result));
    }

    //Method Definition
    public static int[] constructArray(int n, int k) {
        int[] result = new int[n];

        int low = 0;
        int high = k + 1;

        for(int i = 0; i <= k; i++){
            result[i] = (i % 2 == 0) ? low++ : high--;
        }

        for(int i = k + 1; i < n; i++){
            result[i] = i + 1;
        }

        return result;
    }
}
