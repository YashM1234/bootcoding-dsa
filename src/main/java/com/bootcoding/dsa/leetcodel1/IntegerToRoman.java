package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-12 WAP to convert integer to roman
public class IntegerToRoman {
    public static void main(String[] args) {
        int num = 1995;
        //Method Calling
        String roman = intToRoman(num);
        System.out.println(roman);
    }

    //Method Definition
    public static String intToRoman(int num) {
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder roman = new StringBuilder();
         int i = 0;
         while(num > 0){
             if(num >= value[i]){
                 roman.append(symbol[i]);
                 num = num - value[i];
             }
             else{
                 i++;
             }
         }
         return roman.toString();
    }

    //OR

//    public static String intToRoman(int num){
//        int[] value = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
//        String[] symbol = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
//        StringBuilder roman = new StringBuilder();
//        int sLength = symbol.length-1;
//        while(num > 0){
//            if(num >= value[sLength]){
//                roman.append(symbol[sLength]);
//                num = num - value[sLength];
//            }
//            else{
//                sLength--;
//            }
//        }
//        return roman.toString();
//    }
}
