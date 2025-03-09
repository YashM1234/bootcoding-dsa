package com.bootcoding.dsa.leetcodel1;

import java.util.Arrays;

/*
Leetcode Q-242 WAP to verify Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 */
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        //Method Calling
        boolean result = isAnagram(s, t);
        System.out.println(result);
    }

    //Method Definition
    public static boolean isAnagram(String s, String t) {
        s = s.toLowerCase().replaceAll("\\s", "");
        t = t.toLowerCase().replaceAll("\\s", "");

        if(s.length() != t.length()){
            return false;
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);

    }
}
