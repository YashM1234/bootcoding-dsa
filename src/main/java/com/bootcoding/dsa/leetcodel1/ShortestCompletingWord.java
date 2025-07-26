package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-748 WAP to find Shortest Completing Word
Given a string licensePlate and an array of strings words, find the shortest completing word in words.
A completing word is a word that contains all the letters in licensePlate. Ignore numbers and spaces in licensePlate,
and treat letters as case insensitive. If a letter appears more than once in licensePlate, then it must appear in the
word the same number of times or more.
For example, if licensePlate = "aBc 12c", then it contains letters 'a', 'b' (ignoring case), and 'c' twice.
Possible completing words are "abccdef", "caaacab", and "cbca".
Return the shortest completing word in words. It is guaranteed an answer exists. If there are multiple shortest
completing words, return the first one that occurs in words.
 */
public class ShortestCompletingWord {
    public static void main(String[] args) {
        String licensePlate = "1s3 PSt";
        String[] words = {"step","steps","stripe","stepple"};
        //Method Calling
        String result = shortestCompletingWord(licensePlate, words);
        System.out.println(result);
    }

    //Method Definition
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        int[] targetCount = new int[26];
        for(char ch: licensePlate.toCharArray()){
            if(Character.isLetter(ch)){
                targetCount[Character.toLowerCase(ch) - 'a']++;
            }
        }

        String result = null;


        for(String word: words){
            if(isCompletingWord(word, targetCount) && (result == null || word.length() < result.length())){
                    result = word;

            }
        }

        return result;
    }

    //Helper Method
    private static boolean isCompletingWord(String word, int[] targetCount) {
        int[] wordCount = new int[26];

        for(char ch: word.toCharArray()){
            wordCount[ch - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(wordCount[i] < targetCount[i]){
                return false;
            }
        }

        return true;
    }
}
