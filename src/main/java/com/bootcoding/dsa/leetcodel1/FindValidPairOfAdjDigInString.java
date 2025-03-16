package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-3438 WAP to Find Valid Pair of Adjacent Digits in Sting
You are given a string s consisting only of digits. A valid pair is defined as two adjacent digits in s such that:
The first digit is not equal to the second.
Each digit in the pair appears in s exactly as many times as its numeric value.
Return the first valid pair found in the string s when traversing from left to right. If no valid pair exists,
return an empty string.
*/
public class FindValidPairOfAdjDigInString {
    public static void main(String[] args) {
        String s = "2523533";
        //Method Definition
        String result = findValidPair(s);
        System.out.println(result);
    }

    //Method Definition
    public static String findValidPair(String s) {
        int[] frequency = new int[10];

        for(char ch: s.toCharArray()){
            frequency[ch - '0']++;
        }

        for(int i = 0; i < s.length() - 1; i++){
            int firstDigit = s.charAt(i) - '0';
            int secondDigit = s.charAt(i + 1) - '0';

            if(firstDigit != secondDigit && frequency[firstDigit] == firstDigit && frequency[secondDigit] == secondDigit){
                return s.substring(i, i + 2);
            }
        }

        return "";
    }
}
