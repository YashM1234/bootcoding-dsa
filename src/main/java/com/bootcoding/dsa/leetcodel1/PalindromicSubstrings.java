package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-647 WAP for Palindromic Substrings
Given a string s, return the number of palindromic substrings in it.
A string is a palindrome when it reads the same backward as forward.
A substring is a contiguous sequence of characters within the string.
 */
public class PalindromicSubstrings {
    public static void main(String[] args) {
        String s = "abc";
        //Method Calling
        int result = countSubstrings(s);
        System.out.println(result);
    }

    //Method Definition
    public static int countSubstrings(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            count += expandAroundCenter(s, i, i);
            count += expandAroundCenter(s, i, i + 1);
        }

        return count;
    }

    //Helper Function
    private static int expandAroundCenter(String s, int left, int right){
        int count = 0;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            count++;
            left--;
            right++;
        }

        return count;
    }
}
