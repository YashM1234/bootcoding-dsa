package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-383 WAP for Ransom Note
Given two strings ransomNote and magazine, return true if ransomNote can be
constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.
 */
public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        //Method Calling
        boolean result = canConstruct(ransomNote, magazine);
        System.out.println(result);
    }

    //Method Definition
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] counts = new int[26];

        for(char c: magazine.toCharArray()){
            counts[c - 'a']++;
        }

        for(char c: ransomNote.toCharArray()){
            if(counts[c - 'a'] == 0) return false;
            counts[c - 'a']--;
        }

        return true;
    }
}
