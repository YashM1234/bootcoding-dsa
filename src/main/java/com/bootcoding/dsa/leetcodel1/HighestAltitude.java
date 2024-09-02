package com.bootcoding.dsa.leetcodel1;
/*
Leetcode Q-1732 WAP to find the Highest Altitude
There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
The biker starts his trip on point 0 with altitude equal 0.
You are given an integer array gain of length n where gain[i] is the net gain in an altitude
between points i and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
 */
public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        //Method Calling
        int highestAltitude = largestAltitude(gain);
        System.out.println(highestAltitude);
    }

    //Method Definition
    public static int largestAltitude(int[] gain) {
        int max = 0;
        int prev = 0;
        for (int current : gain) {
            prev = prev + current;
            max = Math.max(max, prev);
        }
        return max;
    }
}