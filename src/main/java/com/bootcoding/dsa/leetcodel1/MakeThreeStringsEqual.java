package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-2937 WAP to Make Three Strings Equal
You are given three strings: s1, s2, and s3. In one operation
you can choose one of these strings and delete its rightmost character.
Note that you cannot completely empty a string.
Return the minimum number of operations required to make the strings equal.
If it is impossible to make them equal, return -1.
 */
public class MakeThreeStringsEqual {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abb";
        String s3 = "ab";
        //Method Calling
        int result = findMinimumOperations(s1, s2, s3);
        System.out.println(result);
    }

    //Method Definition
    public static int findMinimumOperations(String s1, String s2, String s3) {

        int commonPrefixLength  = 0;
        int minLength = Math.min(s1.length(), Math.min(s2.length(), s3.length()));

        for(int i = 0; i < minLength; i++){
            if(s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)){
                commonPrefixLength++;
            }else{
                break;
            }
        }

        if(commonPrefixLength == 0){
            return -1;
        }

        return (s1.length() - commonPrefixLength) +
                (s2.length() - commonPrefixLength) +
                (s3.length() - commonPrefixLength);

        //OR

//        int operations = 0;
//
//        while(!(s1.equals(s2) && s2.equals(s3))){
//            if(s1.length() <= 1 || s2.length() <= 1 || s3.length() <= 1){
//                return -1;
//            }
//
//            if(s1.length() >= s2.length() && s2.length() >= s3.length()){
//                s1 = s1.substring(0, s1.length() - 1);
//            }else if(s2.length() >= s1.length() && s2.length() >= s3.length()){
//                s2 = s2.substring(0, s2.length() - 1);
//            }else{
//                s3 = s3.substring(0, s3.length() - 1);
//            }
//            operations++;
//        }
//
//        return operations;
    }
}
