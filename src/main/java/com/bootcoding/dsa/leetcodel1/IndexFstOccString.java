package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-28 WAP to find the index of the first occurrence in a string
Given two strings needle and haystack, return the index of the first occurrence
of needle in haystack, or -1 if needle is not part of haystack.
 */
public class IndexFstOccString {
    public static void main(String[] args) {
        String haystack = "sadandsad";
        String needle = "sad";
        //Method Calling
        int index = strStr(haystack,needle);
        System.out.println(index);
    }

    //Method definition
    public static int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
