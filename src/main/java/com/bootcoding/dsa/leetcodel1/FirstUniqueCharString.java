package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-387 WAP to find index of first unique character in a string, if not exist return -1
public class FirstUniqueCharString {
    public static void main(String[] args) {
        String str = "loveleetcode";
        //Method Calling
        int uniqueCharIndex = firstUniqChar(str);
        System.out.println(uniqueCharIndex);
    }

    //Method Definition
    public static int firstUniqChar(String s) {
        int uniqueCharIndex = Integer.MAX_VALUE;
        for(char ch = 'a'; ch <='z'; ch++){
            int index = s.indexOf(ch);
            if(index != -1 && index == s.lastIndexOf(ch)){
                uniqueCharIndex = Math.min(uniqueCharIndex,index);
            }
        }
        return uniqueCharIndex == Integer.MAX_VALUE ? -1 : uniqueCharIndex;

        //OR

//        int length = s.length();
//        if(length == 1) return 0;
//        for(int i = 0; i < length; i++){
//            int val = s.charAt(i);
//            if(s.indexOf(val) == s.lastIndexOf(val)){
//                return i;
//            }
//        }
//        return -1;

        //OR

//        int length = s.length();
//        if(length == 1) return 0;
//        int count = 0;
//        for(int i = 0; i< length; i++){
//            for(int j = 0; j < length; j++){
//                if(j == i) continue;
//                if(s.charAt(i) == s.charAt(j)) {
//                    count = 0;
//                    break;
//                }
//                count++;
//            }
//            if(count != 0){
//                return i;
//            }
//        }
//        return -1;
    }
}
