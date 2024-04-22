package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-917 WAP to reverse only letters
Given a string s, reverse the string according to the following rules:
All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.
 */
public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s = "!a-bC-dEf-ghIj";
        //Method Calling
        String reverse = reverseOnlyLetters(s);
        System.out.println(reverse);
    }

    //Method Definition
    public static String reverseOnlyLetters(String s){
        char[] chArr = s.toCharArray();
        int first = 0;
        int last = chArr.length-1;

        while(first <= last){
            char ch1 = chArr[first];
            char ch2 = chArr[last];
            if(Character.isLetter(ch1) && Character.isLetter(ch2)) {
                chArr[first++] = ch2;
                chArr[last--] = ch1;
            }
            else if(!Character.isLetter(ch1)){
                first++;
            }
            else if(!Character.isLetter(ch2)){
                last--;
            }
        }
        return new String(chArr);
    }

    //OR

//    public static String reverseOnlyLetters(String s) {
//        int first = 0;
//        int last = s.length()-1;
//        StringBuilder stringBuilder = new StringBuilder(s);
//        while (first <= last){
//            if(!Character.isAlphabetic(s.charAt(first))){
//                first++;
//                continue;
//            }
//            else if(!Character.isAlphabetic(s.charAt(last))){
//                last--;
//                continue;
//            }
//            else{
//                stringBuilder.setCharAt(first, s.charAt(last));
//                stringBuilder.setCharAt(last, s.charAt(first));
//            }
//            first++;
//            last--;
//        }
//        return stringBuilder.toString();
//    }

    //OR

//    public String reverseOnlyLetters(String s) {
//        int first = 0;
//        int last = s.length()-1;
//        StringBuilder stringBuilder = new StringBuilder(s);
//        while (first <= last){
//            if(!isAlphabet(s.charAt(first))){
//                first++;
//                continue;
//            }
//            else if(!isAlphabet(s.charAt(last))){
//                last--;
//                continue;
//            }
//            else{
//                stringBuilder.setCharAt(first, s.charAt(last));
//                stringBuilder.setCharAt(last, s.charAt(first));
//            }
//            first++;
//            last--;
//        }
//        return stringBuilder.toString();
//    }
//    static boolean isAlphabet(char ch){
//        return (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z');
//    }
}
