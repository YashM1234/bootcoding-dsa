package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Leetcode Q-394 WAP to Decode String
Given an encoded string, return its decoded string.
The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated
exactly k times. Note that k is guaranteed to be a positive integer.
You may assume that the input string is always valid; there are no extra white spaces, square brackets are
well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits
are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
The test cases are generated so that the length of the output will never exceed 105.
 */
public class DecodeString {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        //Method Calling
        String result = decodeString(s);
        System.out.println(result);
    }

    //Method Definition
    public static String decodeString(String s) {
        Deque<Integer> countStack = new ArrayDeque<>();
        Deque<StringBuilder> stringStack = new ArrayDeque<>();
        StringBuilder current = new StringBuilder();
        int k = 0;

        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch)){
                k = k * 10 + (ch - '0');
            }else if(ch == '['){
                countStack.push(k);
                stringStack.push(current);
                current = new StringBuilder();
                k = 0;
            }else if(ch == ']'){
                StringBuilder decoded = stringStack.pop();
                int repeatTimes = countStack.pop();
                for(int i = 0; i < repeatTimes; i++){
                    decoded.append(current);
                }
                current = decoded;
            }else{
                current.append(ch);
            }
        }

        return current.toString();
    }
}
