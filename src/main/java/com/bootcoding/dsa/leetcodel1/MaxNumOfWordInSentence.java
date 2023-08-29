package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-2114. WAP to find maximum number of words found in sentences
public class MaxNumOfWordInSentence {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        //Method calling
        int maxNumber = mostWordsFound(sentences);
        System.out.println(maxNumber);
    }
    //Method definition
    public static int mostWordsFound(String[] sentences) {
        //Declaring array for counting each sentences word
        int[] countArr = new int[sentences.length];
        //Counting each sentences word and store in countArr
        for(int i = 0; i < sentences.length; i++){
            String[] count = sentences[i].split(" ");
            countArr[i] = count.length;
        }
        //find maximum number
        int max = countArr[0];
        for (int i = 1; i < sentences.length; i++){
            if(countArr[i] > max){
                max = countArr[i];
            }
        }
        //returning max value
        return max;
    }
}
