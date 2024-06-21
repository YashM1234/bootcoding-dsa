package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-1662. WAP to check if two string arrays are equivalent
public class StringArrayEqualsCheck {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        //Method calling
        boolean bol = arrayStringsAreEqual(word1, word2);
        System.out.println(bol);
    }
    //Method definition
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        //Declaring null string to concatenate string of array word1
        String str1 = "";
        //Declaring null string to concatenate string of array word1
        String str2 = "";
        //concatenate string of array word1
        for(int i = 0; i < word1.length; i++){
            str1 = str1 + word1[i];
        }
        //concatenate string of array word1
        for(int i = 0; i < word2.length; i++){
            str2 = str2 + word2[i];
        }
        //Return true if two string are equal
        return str1.equals(str2);
    }
}
