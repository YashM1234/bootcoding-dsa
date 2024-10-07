package com.bootcoding.dsa.leetcodel1;

import java.util.*;
/*
Leetcode Q-2215 WAP to find the difference of two arrays
Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order.
 */
public class FindDiffOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        //Method Calling
        List<List<Integer>> difference = findDifference(nums1, nums2);
        System.out.println(difference);
    }

    //Method Definition
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getElement(nums1, nums2), getElement(nums2, nums1));
    }

    private static List<Integer> getElement(int[] nums1, int[] nums2) {
        Set<Integer> setNum1 = new HashSet<>();
        Set<Integer> setNum2 = new HashSet<>();

        for( int num: nums2){
            setNum2.add(num);
        }

        for( int num: nums1){
            if(!setNum2.contains(num)){
                setNum1.add(num);
            }
        }

        return new ArrayList<>(setNum1);
    }
}
