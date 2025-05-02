package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayList;
import java.util.List;

/*
Leetcode Q-131 WAP for Palindrome Partitioning
Given a string s, partition s such that every substring of the partition is a palindrome.
Return all possible palindrome partitioning of s.
 */
public class PalindromePartitioning {
    public static void main(String[] args) {
        String s = "aab";
        //Method Calling
        List<List<String >> result = partition(s);
        System.out.println(result);
    }

    //Method Definition
    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(0, s, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int start, String s, List<String> path, List<List<String>> result){
        if(start == s.length()){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int end = start + 1; end <= s.length(); end++){
            String sub = s.substring(start, end);
            if(isPalindrome(sub)){
                path.add(sub);
                backtrack(end, s, path, result);
                path.remove(path.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;
        while (left < right){
            if(str.charAt(left++) != str.charAt(right--)){
                return false;
            }
        }
        return true;
    }

}
