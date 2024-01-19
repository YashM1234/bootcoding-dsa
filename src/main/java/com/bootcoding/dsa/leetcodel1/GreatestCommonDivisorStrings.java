package com.bootcoding.dsa.leetcodel1;
/*
Leetcode Q-1071 WAP to find The Greatest Common Divisor of Strings
 */
public class GreatestCommonDivisorStrings {
    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "ABAB";
        //Method Calling
        String result = gcdOfStrings(str1, str2);
        System.out.println(result);
    }
    //Method Definition
    public static String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }
    private static int gcd(int str1Length, int str2Length) {
        if(str2Length == 0){
            return str1Length;
        }else{
            return gcd(str2Length, str1Length % str2Length);
        }
    }
}
