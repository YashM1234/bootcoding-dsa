package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-1295 WAP to find numbers with even number of digits
//In this when we take input, it is in the form of string numbers hence we use string length() method approach.
public class NumbersWithEvenDigitCountM1 {
    public static void main(String[] args) {
        String[] str = new String[args.length];
        //taking input from the user which is already in string format
        for(int i = 0; i < args.length; i++){
            str[i] = args[i];
        }

        //Method calling
        int totalCount = findNumbers(str);
        System.out.println(totalCount);
    }
    public static int findNumbers(String[] str){
        int count = 0;
        for (int i = 0; i < str.length; i++){
            //use string length() method to count length of number
            int len = str[i].length();
            //Apply even number condition
            if(len%2 == 0){
                count++;
            }
        }
        //Return count
        return count;
    }
}
