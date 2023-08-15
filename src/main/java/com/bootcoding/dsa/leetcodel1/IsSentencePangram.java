package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-1832 WAP to check if the sentence is pangram
public class IsSentencePangram {
    public static void main(String[] args) {
        //Declare and initialise input statement
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        //Method calling
        boolean result = checkIfPangram(sentence);
        System.out.println(result);
    }
    //Method Definition
    public static boolean checkIfPangram(String sentence) {
        //Declare and initialise alphabet
        String alfa = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        //Convert alphabet string into string array
        String[] alfaArray = alfa.split(" ");
        //Declare and initialise count variable to count the present alphabet
        int count = 0;
        //For a loop to check each alphabet in given string
        for (String s : alfaArray) {
            //Condition to check alphabet present given string or not
            if (sentence.contains(s)) {
                count++;
            }
        }
        //if count is equal to number of alphabet[a-z]i.e. 26 return true
        return count == alfaArray.length;
    }
}
