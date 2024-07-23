package com.bootcoding.dsa.leetcodel1;

import java.util.*;

/*
Leetcode Q-1207 WAP for Unique Number of Occurrences
Given an array of integers arr, return true if the number of occurrences
of each value in the array is unique or false otherwise.
 */
public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3,3};
        //Method Calling
        boolean uniqueOcc = uniqueOccurrences(arr);
        System.out.println(uniqueOcc);
    }

    //Method Definition
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num: arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        Set<Integer> uniqueVal = new HashSet<>(freq.values());

        return freq.size() == uniqueVal.size();
    }
}
