package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Leetcode Q-438 WAP to Find All Anagram in a String
Given two strings s and p, return an array of all the start indices of p's anagrams in s.
You may return the answer in any order.
 */
public class FindAllAnagramsInAString {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        //Method Calling
        List<Integer> result = findAnagrams(s, p);
        System.out.println(result);
    }

    //Method Definition
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int n = s.length();
        int m = p.length();

        if(m > n) return res;

        int[] need = new int[26];
        int[] win = new int[26];

        for(char c: p.toCharArray()){
            need[c - 'a']++;
        }

        for(int i = 0; i < m; i++){
            win[s.charAt(i) - 'a']++;
        }

        if(Arrays.equals(win, need)) res.add(0);

        for(int i = m; i < n; i++){
            win[s.charAt(i) - 'a']++;
            win[s.charAt(i - m) - 'a']--;

            if(Arrays.equals(win, need)) res.add(i - m + 1);
        }

        return res;
    }
}
