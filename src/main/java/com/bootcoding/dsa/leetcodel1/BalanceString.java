package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-1221 WAP to split a string in balanced string
//Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
public class BalanceString {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        //Method calling
        int result = balancedStringSplit(s);
        System.out.println(result);
    }

    //Method definition
    public static int balancedStringSplit(String s) {
        int count = 0;
        int r = 0;
        int l = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'R'){
                r++;
            }
            else{
                l++;
            }
            if(r == l){
                count++;
                r = 0;
                l = 0;
            }
        }
        return count;
    }
}
