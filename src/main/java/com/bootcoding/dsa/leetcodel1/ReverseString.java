package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-344. WAP to reverse string
public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'H', 'e', 'l', 'l', 'o'};
        //Method calling
        reverseString(s);
    }
    //Method definition
    public static void reverseString(char[] s) {
        int beg = 0;
        int end = s.length-1;
        while(beg < end) {
            char temp = s[beg];
            s[beg] = s[end];
            s[end] = temp;
            beg++;
            end--;
        }
//OR
//        int n = s.length-1;
//        for(int i = 0; i < s.length/2; i++){
//            char temp = s[i];
//            s[i] = s[n];
//            s[n] = temp;
//            n--;
//        }
        //printing reverse string
        for (char ch: s){
            System.out.print(ch + " ");
        }
    }
}
