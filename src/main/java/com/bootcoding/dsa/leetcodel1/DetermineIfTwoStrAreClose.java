package com.bootcoding.dsa.leetcodel1;

import java.util.Arrays;

/*
Leetcode Q-1657 WAP to determine if two strings are close
Two strings are considered close if you can attain one from the other using the following operations:
Operation 1: Swap any two existing characters.
For example, abcde -> aecdb
Operation 2: Transform every occurrence of one existing character into another existing character,
             and do the same with the other character.
For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
You can use the operations on either string as many times as necessary.

Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.
 */
public class DetermineIfTwoStrAreClose {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "bca";

        //Method Calling
        boolean result = closeStrings(word1, word2);
        System.out.println(result);
    }

    //Method Definition
    public static boolean closeStrings(String word1, String word2) {
        var map1 = new int[26];
        var map2 = new int[26];

        for (var c : word1.toCharArray()) map1[c - 'a']++;
        for (var c : word2.toCharArray()) map2[c - 'a']++;

        for (var i=0; i<26; i++) {
            if (map1[i] == 0 && map2[i] != 0) return false;
            if (map1[i] != 0 && map2[i] == 0) return false;
        }
        Arrays.sort(map1);
        Arrays.sort(map2);

        return Arrays.equals(map1, map2);

    }
}
