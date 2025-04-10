package com.bootcoding.dsa.leetcodel1;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Leetcode Q-2956 WAP to Find Common Elements Between Two Arrays
You are given two integer arrays nums1 and nums2 of sizes n and m, respectively.
Calculate the following values:
answer1 : the number of indices i such that nums1[i] exists in nums2.
answer2 : the number of indices i such that nums2[i] exists in nums1.
Return [answer1,answer2].
 */
public class FindCommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4,3,2,3,1};
        int[] nums2 = {2,2,5,2,3,6};

        //Method Calling
        int[] result = findIntersectionValues(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }

    //Method Definition
    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {

        int count1 = 0;
        int count2 = 0;

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num: nums1) set1.add(num);

        for (int num: nums2) set2.add(num);

        for(int num: nums1){
            if(set2.contains(num)) count1++;
        }

        for(int num: nums2){
            if(set1.contains(num)) count2++;
        }

        return new int[] {count1, count2};
    }
}
