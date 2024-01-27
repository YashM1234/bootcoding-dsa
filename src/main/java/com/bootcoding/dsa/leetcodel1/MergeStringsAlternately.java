package com.bootcoding.dsa.leetcodel1;
/*
Leetcode Q-1768 WAP to Merge Strings Alternately
You are given two strings word1 and word2. Merge the strings by
adding letters in alternating order, starting with word1. If a
string is longer than the other, append the additional letters
onto the end of the merged string.
 */
public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "a";
        String word2 = "pq";
        //Method Calling
        String merged = mergeAlternately(word1, word2);
        System.out.println(merged);
    }
    //Method definition
    public static String mergeAlternately(String word1, String word2) {
        int w1Length = word1.length();
        int w2Length = word2.length();
        String merged = "";

        for(int i = 0; i < Math.max(w1Length, w2Length); i++){
            if(i < w1Length ){
                merged = merged.concat(String.valueOf(word1.charAt(i)));
            }
            if(i < w2Length){
                merged = merged.concat(String.valueOf(word2.charAt(i)));
            }
        }
        return merged;
    }
}
