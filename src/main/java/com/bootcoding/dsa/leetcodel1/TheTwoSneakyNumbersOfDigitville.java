package com.bootcoding.dsa.leetcodel1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Leetcode Q-3289 WAP for The Two Sneaky Numbers Of Digitville
In the town of Digitville, there was a list of numbers called nums containing integers from 0 to n - 1.
Each number was supposed to appear exactly once in the list, however, two mischievous numbers sneaked in
an additional time, making the list longer than usual.
As the town detective, your task is to find these two sneaky numbers. Return an array of size two containing
the two numbers (in any order), so peace can return to Digitville.
*/
public class TheTwoSneakyNumbersOfDigitville {
    public static void main(String[] args) {
        int[] nums = {0,1,1,0};
        //Method Definition
        int[] result = getSneakyNumbers(nums);
        System.out.println(Arrays.toString(result));
    }

    //Method Definition
    public static int[] getSneakyNumbers(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int[] sneakyNumber = new int[2];
        int i = 0;

        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: freqMap.entrySet()){
            if(entry.getValue() == 2){
                sneakyNumber[i++] = entry.getKey();
            }
        }
        return sneakyNumber;
    }
}
