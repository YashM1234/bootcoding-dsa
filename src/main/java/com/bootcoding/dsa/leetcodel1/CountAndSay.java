package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-38 WAP for count and say
The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
countAndSay(1) = "1"
countAndSay(n) is the run-length encoding of countAndSay(n - 1).
Run-length encoding (RLE) is a string compression method that works by replacing
consecutive identical characters (repeated 2 or more times) with the concatenation of the character and
the number marking the count of the characters (length of the run). For example, to compress
the string "3322251" we replace "33" with "23", replace "222" with "32", replace "5" with "15" and
replace "1" with "11". Thus the compressed string becomes "23321511".
Given a positive integer n, return the nth element of the count-and-say sequence.
 */
public class CountAndSay {
    public static void main(String[] args) {
        int n = 6;
        //Method Calling
        String result = countAndSay(n);
        System.out.println(result);
    }

    //Method Definition
    public static String countAndSay(int n) {
        if(n == 1) return "1";

        String prev = countAndSay( n - 1);
        StringBuilder result = new StringBuilder();

        int count = 1;
        for(int i = 1; i < prev.length(); i++){
            if(prev.charAt(i) == prev.charAt(i - 1)){
                count++;
            }else {
                result.append(count).append(prev.charAt(i - 1));
                count = 1;
            }
        }

        result.append(count).append(prev.charAt(prev.length() - 1));

        return result.toString();
    }
}
