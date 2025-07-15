package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-709 WAP to convert To Lower Case
Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
 */
public class ToLowerCase {
    public static void main(String[] args) {
        String s = "Hello";
        //Method Calling
        String result  = toLowerCase(s);
        System.out.println(result);
    }

    //Method Definition
    public static String toLowerCase(String s) {
        StringBuilder newS = new StringBuilder();

        for(char c: s.toCharArray()){
            if (c >= 'A' && c <= 'Z') {
                newS.append((char) (c + ('a' - 'A')));
            }else{
                newS.append(c);
            }
        }

        return newS.toString();
    }
}
