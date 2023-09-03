package com.bootcoding.dsa.leetcodel1;
import java.util.HashSet;
import java.util.Set;
//Leetcode Q-3 WAP for longest substring without repeating characters
public class LongestSubStringWithOutRepeatingChar {
    public static void main(String[] args) {
        String s = "abcabcbb";
        //Method Calling
        int maxSubstring = lengthOfLongestSubstring(s);
        System.out.println(maxSubstring);
    }

    //Method Definition
    //With HashSet
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int maxSubstring = 1;
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            if (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            } else {
                set.add(s.charAt(right));
                right++;
                maxSubstring = Math.max(maxSubstring, set.size());
            }
        }
        return maxSubstring;
    }

    //OR
    //With StringBuilder
//    public static int lengthOfLongestSubstring(String s) {
//        if(s.length() == 0){
//            return 0;
//        }
//        int maxSubString = 1;
//        int right = 0;
//        int left = 0;
//        StringBuilder newString = new StringBuilder();
//        while(right < s.length()){
//            if((newString.toString().contains(String.valueOf(s.charAt(right))))) {
//                newString.delete(0, 1);
//                left++;
//            }else{
//                newString.append(s.charAt(right));
//                right++;
//                maxSubString = Math.max(maxSubString, newString.length());
//            }
//        }
//        return maxSubString;
//    }
}
