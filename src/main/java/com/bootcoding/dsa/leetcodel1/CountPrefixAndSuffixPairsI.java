package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-3042 WAP to Count Prefix And Suffix Pairs I
You are given a 0-indexed string array words.
Let's define a boolean function isPrefixAndSuffix that takes two strings, str1 and str2:
isPrefixAndSuffix(str1, str2) returns true if str1 is both a prefix and a suffix of str2, and false otherwise.
For example, isPrefixAndSuffix("aba", "ababa") is true because "aba" is a prefix of "ababa" and also a suffix,
but isPrefixAndSuffix("abc", "abcd") is false.
Return an integer denoting the number of index pairs (i, j) such that i < j, and isPrefixAndSuffix(words[i],
words[j]) is true.
 */
public class CountPrefixAndSuffixPairsI {
    public static void main(String[] args) {
        String[] words = {"a","aba","ababa","aa"};

        //Method Calling
        int result = countPrefixSuffixPairs(words);
        System.out.println(result);
    }

    //Method Definition
    public static int countPrefixSuffixPairs(String[] words) {
        int count = 0;

        for(int i = 0; i < words.length; i++){
            String prefixSuffix = words[i];
            int len = prefixSuffix.length();

            for(int j = i + 1; j < words.length; j++){
                String word = words[j];

                if(word.length() >= len && word.startsWith(prefixSuffix) && word.endsWith(prefixSuffix)){
                    count++;
                }
            }
        }

        return count;
    }
}
