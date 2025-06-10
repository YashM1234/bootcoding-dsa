package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-434 WAP to Find Number of Segments in a String
Given a string s, return the number of segments in the string.
A segment is defined to be a contiguous sequence of non-space characters.
 */
public class NumberOfSegmentInString {
    public static void main(String[] args) {
        String s = "Hello, my name is John";
        //Method Calling
        int result = countSegments(s);
        System.out.println(result);
    }

    //Method Definition
    public static int countSegments(String s) {
//        if(s == null || s.trim().isEmpty()) return 0;
//        String[] str = s.trim().split("\\s+");
//        return str.length;

        //OR

        int count = 0;
        int n = s.length();
        boolean inSegment = false;

        for(int i = 0; i < n; i++){
            if(s.charAt(i) != ' '){
                if(!inSegment){
                    count++;
                    inSegment = true;
                }
            }else{
                inSegment = false;
            }
        }
        return count;
    }
}
