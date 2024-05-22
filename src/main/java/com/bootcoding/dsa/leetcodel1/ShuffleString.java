package com.bootcoding.dsa.leetcodel1;
import java.util.HashMap;
import java.util.Map;

/* Leetcode Q-1528 WAP to shuffle string
You are given a string s and an integer array indices of the same length.
The string s will be shuffled such that the character at the ith position
moves to indices[i] in the shuffled string.
Return the shuffled string.
 */
public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        //Method Calling
        String shuffledStr = restoreString(s, indices);
        System.out.println(shuffledStr);
    }

    //Method Definition
    public static String restoreString(String s, int[] indices) {

        char[] charArr = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            charArr[indices[i]] = s.charAt(i);
        }
        return new String(charArr);

        //OR

//        StringBuilder newString = new StringBuilder();
//        for(int i = 0; i < indices.length; i++){
//            for(int j = 0; j < indices.length; j++){
//                if(indices[j] == i){
//                    newString.append(s.charAt(j));
//                    break;
//                }
//            }
//        }
//        return newString.toString();

        //OR

//        Map<Integer, Character> map = new HashMap<>();
//        for(int i = 0; i < indices.length; i++){
//            map.put(indices[i], s.charAt(i));
//        }
//
//        StringBuilder strB = new StringBuilder();
//        for(int i = 0; i < indices.length; i++){
//            String letter = map.get(i).toString();
//            strB.append(letter);
//        }
//        return strB.toString();
    }
}
