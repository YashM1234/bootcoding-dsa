package com.bootcoding.dsa.leetcodel1;
/*
Leetcode Q-11 WAP to find container with most water
You are given an integer array height of length n. There are n vertical lines drawn
such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container
contains the most water.
Return the maximum amount of water a container can store.
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        //Method Calling
        int max = maxArea(height);
        System.out.println(max);
    }

    //Method Definition
    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxArea = 0;

        while (start < end) {
            int h = Math.min(height[start], height[end]);
            int w = end - start;
            int currentArea = h * w;

            maxArea = Math.max(maxArea, currentArea);

            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }

        return maxArea;
    }

}
