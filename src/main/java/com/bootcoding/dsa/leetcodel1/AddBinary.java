package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-67 WAP to add binary, Given two binary strings a and b, return their sum as a binary string.
public class AddBinary {
    public static void main(String[] args) {
        String a = "1";
        String b = "11";
        //Method Calling
        String resString = addBinary(a, b);
        System.out.println(resString);
    }

    //Method Definition
    public static String addBinary(String a, String b) {
        int indexA = a.length()-1;
        int indexB = b.length()-1;
        StringBuilder newString = new StringBuilder();
        char charA, charB;
        boolean carry = false;

        while (indexA >= 0 || indexB >= 0 || carry) {
            charA = (indexA >= 0) ? a.charAt(indexA) : '0';
            charB = (indexB >= 0) ? b.charAt(indexB) : '0';

            char sum;
            if (charA == '0' && charB == '0') {
                sum = carry ? '1' : '0';
                carry = false;
            } else if (charA == '1' && charB == '1') {
                sum = carry ? '1' : '0';
                carry = true;
            } else {
                sum = carry ? '0' : '1';
            }
            newString.append(sum);
            indexA--;
            indexB--;
        }
        return newString.reverse().toString();
    }
}
