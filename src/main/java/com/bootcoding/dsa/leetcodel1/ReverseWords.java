package com.bootcoding.dsa.leetcodel1;
/*
Leetcode Q-151 WAP to Reverse Words in a String
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words.
The returned string should only have a single space separating the words. Do not include any extra spaces.
 */
public class ReverseWords {
    public static void main(String[] args) {
        String s = "  hello world  ";
        //Method Calling
        String resultantStr = reverseWords(s);
        System.out.println(resultantStr);
    }

    //Method Definition
    public static String reverseWords(String s) {
        String[] words = s.split("\\s+");
        int left = 0;
        int right = words.length - 1;

        while (left < right) {
            String temp = words[left];
            words[left++] = words[right];
            words[right--] = temp;
        }
        StringBuilder resultantStr = new StringBuilder();

        for(String word : words) {
            resultantStr.append(word);
            resultantStr.append(" ");
        }
        return resultantStr.toString().trim();
    }
}
