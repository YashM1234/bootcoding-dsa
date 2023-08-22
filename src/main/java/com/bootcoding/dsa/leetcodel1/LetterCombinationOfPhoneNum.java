package com.bootcoding.dsa.leetcodel1;
import java.util.ArrayList;
import java.util.List;
//Leetcode Q-17 WAP for letter combinations of a phone number digits from 0-9
public class LetterCombinationOfPhoneNum {
    public static void main(String[] args) {
        String digits = "23";
        //Create an object of LetterCombinationSolution
        LetterCombinationSolution letterCombinationSolution = new LetterCombinationSolution();
        //Method Calling
        List<String> allCombination = letterCombinationSolution.letterCombinations(digits);
        for(String s: allCombination){
            System.out.println(s);
        }
    }
}

//Class containing all logic to find the total possible combination
class LetterCombinationSolution{
    List<String> strList = null;
    String[] phone_map = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        strList = new ArrayList<>();
        if(digits.length() == 0){
            return strList;
        }
        //Create String Builder
        StringBuilder newString = new StringBuilder();
        //Method calling
        combination(0, digits, newString);
        return strList;
    }
    //Method which find combination
    void combination(int digitSize, String digits, StringBuilder newString){
        //termination condition
        if(digitSize == digits.length()){
            strList.add(newString.toString());
            return;
        }

        char ch = digits.charAt(digitSize);
        String str = phone_map[ch - '0']; // ASCII value subtract to get index

        for(char c: str.toCharArray()){
            newString.append(c);
            //recursion
            combination(digitSize + 1, digits, newString);
            //delete last letter from newString
            newString.deleteCharAt(newString.length()-1);
        }
    }
}
