package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-2185 WAP for counting words with a given prefix
You are given an array of strings words and a string pref.
Return the number of strings in words that contain pref as a prefix.
A prefix of a string s is any leading contiguous substring of s.
 */
public class CountingWordsWithGivPrefix {
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
        //Method calling
        int totalCount = prefixCount(words, pref);
        System.out.println(totalCount);
    }

    //Method definition
    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for(String word : words){
            if(word.startsWith(pref)){
                count++;
            }
        }
        return count;

        //OR

//        int count = 0;
//        int temp = 0;
//        for(String word: words){
//            if(word.length() >= pref.length()){
//                for(int i = 0; i < pref.length(); i++){
//                    if(word.charAt(i) != pref.charAt(i)){
//                        temp = 0;
//                        break;
//                    }else{
//                        temp++;
//                    }
//                }
//            }else{
//                continue;
//            }
//            if(temp != 0){
//                count++;
//            }
//        }
//        return count;

    }
}
