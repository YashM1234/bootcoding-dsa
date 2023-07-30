package com.bootcoding.dsa.leetcodel1;
//Leetcode Q58. WAP to find the length of last word
public class CountLengthOfLastWord {
    public static void main(String[] args) {
        //Taking string as an input from user and store it in variable s
        String s = args[0];
        //Calling method lengthOfLastWord, lastWordCount holds the return value by the method
        int lastWordCount = lengthOfLastWord(s);
        System.out.println(lastWordCount);

    }
    //Method Definition
    public static int lengthOfLastWord(String s) {
        System.out.println(s);
        String newS1 = s.trim();
        String[] newS2 = newS1.split(" ");
        int len = newS2.length;
        String lastWord = newS2[len-1];
        int count = lastWord.length();
        return count;
    }
}
