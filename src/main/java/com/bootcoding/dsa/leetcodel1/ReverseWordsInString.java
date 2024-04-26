package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-557. WAP to reverse words in a string III
public class ReverseWordsInString {
    public static void main(String[] args) {
        //Declaring and initialising input string
        String s = "Let's take LeetCode contest";
        //Method calling
        String result = reverseWords(s);
        System.out.println(result);
    }
    //Method Definition
    public static String reverseWords(String s) {
        //Splitting the string into array string
        String[] strArr = s.split(" ");
        //Creating empty string, in this we store reverse string
        String rStr = "";
        //Creating string array where we store each reverse words
        String[] newStrArr = new String[strArr.length];
        //Loop to reverse each word and store in array
        for (int i = 0; i < strArr.length; i++){
            //Convert each words into character array
           char[] word = strArr[i].toCharArray();
           //method calling i.e. reverseSingleWord() to reverse each word in string
           String rWord = reverseSingleWord(word);
           //assign each reverse word to newStrArr
           newStrArr[i] = rWord;
        }
        //join each word in an array and form string and return it
        return rStr = String.join(" ", newStrArr);
    }
    //Method Definition to reverse each words character and return reverse word
    public static String reverseSingleWord(char[] word) {
        int beg = 0;
        int end = word.length - 1;
        while (beg < end) {
            char temp = word[beg];
            word[beg] = word[end];
            word[end] = temp;
            beg++;
            end--;
        }
        //convert character to string
        String rCharToString = new String(word);
        return rCharToString;
    }
}
