package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayList;
import java.util.List;

/*
Leetcode Q-68 WAP for Text Justification
Given an array of strings words and a width maxWidth, format the text such that each line has exactly
maxWidth characters and is fully (left and right) justified.
You should pack your words in a greedy approach; that is, pack as many words as you can in each line.
Pad extra spaces ' ' when necessary so that each line has exactly maxWidth characters.
Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a
line does not divide evenly between words, the empty slots on the left will be assigned more spaces
than the slots on the right.
For the last line of text, it should be left-justified, and no extra space is inserted between words.
Note:
A word is defined as a character sequence consisting of non-space characters only.
Each word's length is guaranteed to be greater than 0 and not exceed maxWidth.
The input array words contains at least one word.
 */
public class TextJustification {
    public static void main(String[] args) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        //Method Calling
        List<String> result = fullJustify(words, maxWidth);
        System.out.println(result);

    }

    //Method Definition
    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int n = words.length;
        int i = 0;

        while(i < n){
            int charCnt = 0;
            int j = i;

            while (j < n && charCnt + words[j].length() <= maxWidth){
                charCnt += words[j].length() + 1;
                j++;
            }

            int gaps = j - i - 1;
            int spaces = maxWidth - (charCnt - (j - i));
            StringBuilder sb = new StringBuilder();

            if(j == n || gaps == 0){
                for(int k = i; k < j; k++){
                    sb.append(words[k]);
                    if(k < j - 1) sb.append(" ");
                }
                while(sb.length() < maxWidth){
                    sb.append(" ");
                }
            }else{
                for(int k = i; k < j; k++){
                    sb.append(words[k]);
                    if(k < j - 1){
                        int spacesToAdd = spaces / gaps + (k - i < spaces % gaps ? 1 : 0);
                        for(int l = 0; l < spacesToAdd; l++) {
                            sb.append(" ");
                        }
                    }
                }
            }
            result.add(sb.toString());
            i = j;
        }
        return result;
    }
}

