package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-481 WAP for Magical String
A magical string s consists of only '1' and '2' and obeys the following rules:
The string s is magical because concatenating the number of contiguous occurrences of characters '1' and '2'
generates the string s itself.
The first few elements of s is s = "1221121221221121122……". If we group the consecutive 1's and 2's in s,
it will be "1 22 11 2 1 22 1 22 11 2 11 22 ......" and the occurrences of 1's or 2's in each group are
"1 2 2 1 1 2 1 2 2 1 2 2 ......". You can see that the occurrence sequence is s itself.
Given an integer n, return the number of 1's in the first n number in the magical string s.
 */
public class MagicalString {
    public static void main(String[] args) {
        int n = 6;
        //Method Calling
        int result = magicalString(n);
        System.out.println(result);
    }

    //Method Definition
    public static int magicalString(int n) {
        if(n == 0) return 0;
        if(n <= 3) return 1;

        int[] magic = new int[n + 1];
        magic[0] = 1;
        magic[1] = 2;
        magic[2] = 2;

        int head = 2;
        int tail = 3;
        int num = 1;
        int count = 1;

        while(tail < n){
            for(int i = 0; i < magic[head]; i++){
                if(tail >= n) break;
                magic[tail] = num;
                if(num == 1) count++;
                tail++;
            }
            num = 3 - num;
            head++;
        }

        return count;
    }

}
