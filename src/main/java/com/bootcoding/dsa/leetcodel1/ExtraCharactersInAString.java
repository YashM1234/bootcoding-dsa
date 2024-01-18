package com.bootcoding.dsa.leetcodel1;

import java.util.Arrays;
import java.util.HashSet;

/* Leetcode Q-2707 WAP for extra characters in a string
You are given a 0-indexed string s and a dictionary of words dictionary. You have to
break s into one or more non-overlapping substrings such that each substring is present
in a dictionary. There may be some extra characters in s which are not present in any of the substrings.
Return the minimum number of extra characters left over if you break up s optimally.
 */
public class ExtraCharactersInAString {
    public static void main(String[] args) {
        String s = "sayhelloworld";
        String[] dictionary = {"hello","world"};
        //Method Calling
        int extraChar = minExtraChar(s, dictionary);
        System.out.println(extraChar);
    }

    //Method Definition
    public static int minExtraChar(String s, String[] dictionary) {

        int length = s.length();
        var dictionarySet = new HashSet<>(Arrays.asList(dictionary));
        var extraChar = new int[length + 1];

        for (int start = length - 1; start >= 0; start--) {
            extraChar[start] = extraChar[start + 1] + 1;
            StringBuilder currentWord = new StringBuilder();
            for (int end = start; end < length; end++) {
                currentWord.append(s.charAt(end));
                if (dictionarySet.contains(currentWord.toString())) {
                    extraChar[start] = Math.min(extraChar[start], extraChar[end + 1]);
                }
            }
        }

        return extraChar[0];
    }
}
