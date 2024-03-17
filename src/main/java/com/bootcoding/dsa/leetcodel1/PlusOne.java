package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-66 WAP to plus one in an array
You are given a large integer represented as an integer array digits,
where each digits[i] is the ith digit of the integer. The digits are
ordered from most significant to least significant in left-to-right order.
The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.
 */
public class PlusOne {
    public static void main(String[] args) {
        //Declare and initialized array
        int[] digits = {9, 9, 9};
        //Method Calling
        int[] plusOneArr = plusOne(digits);
        for(int element: plusOneArr){
            System.out.println(element);
        }
    }

    //Method Definition
    public static int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
