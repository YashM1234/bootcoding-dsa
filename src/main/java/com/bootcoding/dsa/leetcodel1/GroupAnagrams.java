package com.bootcoding.dsa.leetcodel1;

import java.util.*;

/*
Leetcode Q-49 WAP to group anagrams together
Given an array of strings strs, group the anagrams together.
You can return the answer in any order.
 */
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        //Method Calling
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
    }

    //Method Definition
    public  static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String word: strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
