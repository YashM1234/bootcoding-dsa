package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-423 WAP to Reconstruct Original Digits from English
Given a string s containing an out-of-order English representation of digits 0-9, return the digits in ascending order.
 */
public class ReconstructOriginalDigitsFromEnglish {
    public static void main(String[] args) {
        String s = "fviefuro";
        //Method Calling
        String result = originalDigits(s);
        System.out.println(result);
    }
    //Method Definition
    public static String originalDigits(String s) {
        int[] count = new int[26];
        for(char ch: s.toCharArray()){
            count[ch - 'a']++;
        }

        int[] digits = new int[10];

        digits[0] = count['z' - 'a'];
        digits[2] = count['w' - 'a'];
        digits[4] = count['u' - 'a'];
        digits[6] = count['x' - 'a'];
        digits[8] = count['g' - 'a'];

        digits[3] = count['h' - 'a'] - digits[8];
        digits[5] = count['f' - 'a'] - digits[4];
        digits[7] = count['s' - 'a'] - digits[6];

        digits[1] = count['o' - 'a'] - digits[0] - digits[2] - digits[4];
        digits[9] = count['i' - 'a'] - digits[5] - digits[6] - digits[8];

        StringBuilder result = new StringBuilder();
        for(int i = 0; i <= 9; i++){
            while (digits[i]-- > 0){
                result.append(i);
            }
        }

        return result.toString();
    }
}
