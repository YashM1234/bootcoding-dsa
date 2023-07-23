package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-9. WAP to check the given number is Palindrome or not
public class CheckPalindromeNumber {
    public static void main(String[] args) {
        //Take user input
        for (String value : args) {
            int x = Integer.parseInt(value);

            System.out.println("The entered number is " + x);
            //Method calling
            boolean res = isPalindrome(x);
            System.out.println("isPalindromes? " + res);
            System.out.println();
        }
    }
    //Method definition
    public static boolean isPalindrome(int x) {
        int temp = x;
        int r = 0;
        if(temp < 0){
            return false;
        }
        while(x != 0){
            r = r * 10 + x%10;
            x = x/10;
        }
        boolean result;
        result = (temp == r);
        return result;
    }
}
