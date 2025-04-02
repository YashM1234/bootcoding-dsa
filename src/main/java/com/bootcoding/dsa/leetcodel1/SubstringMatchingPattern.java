package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-3407 WAP to find Substring Matching Pattern
You are given a string s and a pattern string p, where p contains exactly one '*' character.
The '*' in p can be replaced with any sequence of zero or more characters.
Return true if p can be made a substring of s, and false otherwise.
*/
public class SubstringMatchingPattern {
    public static void main(String[] args) {
        String s = "nrnrs";
        String p = "*nn";

        //Method Calling
        boolean result = hasMatch(s, p);
        System.out.println(result);
    }

    //Method Definition
    public static boolean hasMatch(String s, String p) {
        String[] parts = p.split("\\*", 2);
        String prefix = parts[0];
        String suffix = parts[1];

        int prefixIndex = s.indexOf(prefix);
        if (prefixIndex == -1) return false;

        return s.indexOf(suffix, prefixIndex + prefix.length()) != -1;

        //OR

//        int index = p.indexOf('*');
//        int firstpos = s.indexOf(p.substring(0, index));
//        int secondpos = s.indexOf(p.substring(index + 1), firstpos + index);
//        if (firstpos != -1 && secondpos != -1) {
//            return true;
//        }
//        return false;
    }
}
