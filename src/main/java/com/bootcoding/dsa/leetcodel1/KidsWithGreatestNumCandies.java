package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayList;
import java.util.List;

/*
Leetcode Q-1431 WAP to find Kids With the Greatest Number of Candies
 */
public class KidsWithGreatestNumCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};;
        int extraCandies = 3;
        //Method Calling
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }

    //Method Definition
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for (int candy: candies) {
            maxCandies = Math.max(candy, maxCandies);
        }

        List<Boolean> result = new ArrayList<>();
        for (int candy: candies) {
            result.add(candy + extraCandies >= maxCandies);
        }
        return result;
    }
}
