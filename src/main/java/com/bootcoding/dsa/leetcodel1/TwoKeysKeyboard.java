package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-650 WAP for 2 Keys keyboard
There is only one character 'A' on the screen of a notepad.
You can perform one of two operations on this notepad for each step:
Copy All: You can copy all the characters present on the screen (a partial copy is not allowed).
Paste: You can paste the characters which are copied last time.
Given an integer n, return the minimum number of operations to get the character 'A' exactly n times on the screen.
 */
public class TwoKeysKeyboard {
    public static void main(String[] args) {
        int n = 3;
        //Method Calling
        int result = minSteps(n);
        System.out.println(result);
    }

    //Method Definition
    public static int minSteps(int n) {
        int res = 0;
        for(int i = 2; i <= n; i++){
            while(n % i == 0){
                res += i;
                n /= i;
            }
        }

        return res;
    }
}
