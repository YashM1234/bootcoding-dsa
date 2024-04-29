package com.bootcoding.dsa.leetcodel1;
import java.util.HashMap;
import java.util.Map;
//Leetcode Q-13 WAP to convert Roman to Integer
public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MDCCCLXXXIV";
        //Method Calling
        int result = romanToInt(s);
        System.out.println(result);
    }

    //Method Definition
    public static int romanToInt(String s) {
        int length = s.length();
        int result = 0;
        int value = 0;
        for(int i = length-1; i >= 0; i--){
            switch (s.charAt(i)) {
                case 'I' -> value = 1;
                case 'V' -> value = 5;
                case 'X' -> value = 10;
                case 'L' -> value = 50;
                case 'C' -> value = 100;
                case 'D' -> value = 500;
                case 'M' -> value = 1000;
            }

            if(value * 3 < result){
                result  = result - value;
            }else{
                result = result + value;
            }
        }
        return result;
    }

    //OR

//    public static int romanToInt(String s) {
//
//        Map<Character, Integer> value = new HashMap<>();
//        value.put('I', 1);
//        value.put('V', 5);
//        value.put('X', 10);
//        value.put('L', 50);
//        value.put('C', 100);
//        value.put('D', 500);
//        value.put('M', 1000);
//
//        int result = 0;
//        for(int i = 0; i < s.length(); i++){
//            if(i < s.length()-1 && value.get(s.charAt(i)) < value.get(s.charAt(i+1))){
//                result = result - value.get(s.charAt(i));
//            }else{
//                result = result + value.get(s.charAt(i));
//            }
//        }
//        return result;
//    }
}
