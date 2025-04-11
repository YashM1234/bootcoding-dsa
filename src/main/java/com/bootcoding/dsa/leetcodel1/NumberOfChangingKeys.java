package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-3019 WAP to Find Number of Changing Keys
You are given a 0-indexed string s typed by a user. Changing a key is defined as using a
key different from the last used key. For example, s = "ab" has a change of a key while s = "bBBb" does not have any.
Return the number of times the user had to change the key.
Note: Modifiers like shift or caps lock won't be counted in changing the key that is if a
user typed the letter 'a' and then the letter 'A' then it will not be considered as a changing of key.
 */
public class NumberOfChangingKeys {
    public static void main(String[] args) {
        String s = "aAbBcC";
        //Method Calling
        int result = countKeyChanges(s);
        System.out.println(result);
    }

    //Method Definition
    public static int countKeyChanges(String s) {
        int count = 0;
        s = s.toLowerCase();

        for (int i = 1; i < s.length(); i++){
           if(s.charAt(i) != s.charAt(i - 1)){
                count++;
            }
        }

        return count;
    }
}
