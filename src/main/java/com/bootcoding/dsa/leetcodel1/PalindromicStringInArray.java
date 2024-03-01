package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-2108 WAP to find first palindromic string in the array
public class PalindromicStringInArray {
    public static void main(String[] args) {
        String[] words = {"abhjhba","car","ada","racecar","cool"};
        //Method Calling
        String pWord = firstPalindrome(words);
        System.out.println(pWord);
    }

    //Method Definition
    public static String firstPalindrome(String[] words) {
        for(String s : words){
            int first = 0;
            int last = s.length()-1;
            int count = 0;

            while(first <= last){
                if(s.charAt(first) == s.charAt(last)){
                    count++;
                }else{
                    break;
                }
                first++;
                last--;
            }
            if(s.length()%2 == 0 && count == s.length()/2 || count == (s.length()+1)/2){
                return s;
            }
        }
        return "";
    }

    //OR

//    public static String firstPalindrome(String[] words) {
//        for(String word : words) {
//            if(palindromeCheck(word)) {
//                return word;
//            }
//        }
//        return "";
//    }
//
//    static boolean palindromeCheck(String word) {
//        int first = 0;
//        int last = word.length() - 1;
//        while(first <= last) {
//            if(word.charAt(first++) != word.charAt(last--)){
//                return false;
//            }
//        }
//        return true;
//    }

    //OR

//    public static String firstPalindrome(String[] words) {
//        for(String word : words) {
//            if(palindrome(word)) {
//                return word;
//            }
//        }
//        return "";
//    }
//
//    static boolean palindrome(String word) {
//        int first = (word.length()) / 2;
//        int last = (word.length() - 1) / 2;
//        while(first >= 0) {
//            if(word.charAt(first--) != word.charAt(last++))
//                return false;
//        }
//        return true;
//    }
}
