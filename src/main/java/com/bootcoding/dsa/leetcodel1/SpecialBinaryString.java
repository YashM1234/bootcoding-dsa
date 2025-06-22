package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Leetcode Q-761 WAP for Special Binary String
Special binary strings are binary strings with the following two properties:
The number of 0's is equal to the number of 1's.
Every prefix of the binary string has at least as many 1's as 0's.
You are given a special binary string s.
A move consists of choosing two consecutive, non-empty, special substrings of s, and swapping them.
Two strings are consecutive if the last character of the first string is exactly one index before the first character
of the second string.
Return the lexicographically largest resulting string possible after applying the mentioned operations on the string.
 */
public class SpecialBinaryString {
    public static void main(String[] args) {
        String s = "11011000";
        //Method Calling
        String result = makeLargestSpecial(s);
        System.out.println(result);
    }
    //Method Definition
    public static String makeLargestSpecial(String s) {
        List<String> subs = new ArrayList<>();
        int count = 0;
        int start = 0;

        for(int i = 0; i < s.length(); i++){
            count += s.charAt(i) == '1' ? 1 : -1;
            if(count == 0){
                String inner = s.substring(start + 1, i);
                subs.add("1" + makeLargestSpecial(inner) + "0");
                start = i + 1;
            }
        }

        subs.sort(Collections.reverseOrder());

        return String.join("", subs);
    }
}
