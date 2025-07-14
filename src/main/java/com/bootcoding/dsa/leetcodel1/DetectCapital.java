package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-520 WAP to Detect Capital
We define the usage of capitals in a word to be right when one of the following cases holds:
All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
 */
public class DetectCapital {
    public static void main(String[] args) {
        String word = "FlaG";
        //Method Calling
        boolean result = detectCapitalUse(word);
        System.out.println(result);
    }

    //Method Definition
    public static boolean detectCapitalUse(String word) {
        int upperCaseCount = 0;
        int len = word.length();

        for(char c: word.toCharArray()){
            if(Character.isUpperCase(c)){
                upperCaseCount++;
            }
        }

        if(upperCaseCount == len) return true;
        if(upperCaseCount == 0) return true;
        return upperCaseCount == 1 && Character.isUpperCase(word.charAt(0));
    }
}
