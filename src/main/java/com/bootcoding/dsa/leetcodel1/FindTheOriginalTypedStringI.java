package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-3330 WAP to Find The Original Typed String I
Alice is attempting to type a specific string on her computer. However, she tends to be clumsy and
may press a key for too long, resulting in a character being typed multiple times.
Although Alice tried to focus on her typing, she is aware that she may still have done this at most once.
You are given a string word, which represents the final output displayed on Alice's screen.
Return the total number of possible original strings that Alice might have intended to type.
 */
public class FindTheOriginalTypedStringI {
    public static void main(String[] args) {
        String word = "aaaa";
        //Method Calling
        int result = possibleStringCount(word);
        System.out.println(result);
    }

    //Method Definition
    public static int possibleStringCount(String word) {
        int possible = 1;
        for(int i = 0; i < word.length()-1; i++){
            if(word.charAt(i) == word.charAt(i+1)){
                possible = possible + 1;
            }
        }
        return possible;
    }
}
