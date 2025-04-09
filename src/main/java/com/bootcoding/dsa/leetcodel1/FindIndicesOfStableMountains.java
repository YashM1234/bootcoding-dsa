package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayList;
import java.util.List;

/*
Leetcode Q-3285 WAP to Find Indices Of Stable Mountains
There are n mountains in a row, and each mountain has a height. You are given an integer array height
where height[i] represents the height of mountain i, and an integer threshold.
A mountain is called stable if the mountain just before it (if it exists) has a height strictly greater
than threshold. Note that mountain 0 is not stable.
Return an array containing the indices of all stable mountains in any order.
 */
public class FindIndicesOfStableMountains {
    public static void main(String[] args) {
        int[] height = {10,1,10,1,10};
        int threshold = 10;
        //Method Calling
        List<Integer> result = stableMountains(height, threshold);
        System.out.println(result);
    }

    //Method Definition
    public static List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> stable = new ArrayList<>();

        for(int i = 1; i < height.length; i++){
            if(height[i - 1] > threshold){
                stable.add(i);
            }
        }

        return stable;
    }
}
