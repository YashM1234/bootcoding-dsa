package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-273 WAP to Convert Integer to English Words
Convert a non-negative integer num to its English words representation.
 */
public class IntegerToEnglishWords {
    private final String[] LESS_THAN_20 = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };
    private final String[] TENS = {
            "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
    private final String[] THOUSANDS = {
            "", "Thousand", "Million", "Billion"
    };

    public static void main(String[] args) {
        int num = 123;
        IntegerToEnglishWords obj = new IntegerToEnglishWords();
        //Method Calling
        String result = obj.numberToWords(num);
        System.out.println(result);
    }

    //Method Definition
    public String numberToWords(int num) {
        if(num == 0) return "Zero";
        int i = 0;
        String words = "";

        while (num > 0){
            if(num % 1000 != 0){
                words = helper(num % 1000) + THOUSANDS[i] + (words.isEmpty() ? "" : " " + words);
            }
            num /= 1000;
            i++;
        }
        return words.trim();
    }

    private String helper(int num){
        if(num == 0) return "";
        else if(num < 20) return LESS_THAN_20[num] + " ";
        else if(num < 100) return TENS[num / 10] + " " + helper(num % 10);
        else return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
    }
}
