package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-97 WAP for Interleaving String
Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.
An interleaving of two strings s and t is a configuration where s and t are divided
into n and m substrings respectively, such that:
s = s1 + s2 + ... + sn
t = t1 + t2 + ... + tm
|n - m| <= 1
The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or t1 + s1 + t2 + s2 + t3 + s3 + ...
Note: a + b is the concatenation of strings a and b.
 */
public class InterleavingString {
    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        //Method Calling
        boolean result = isInterleave(s1, s2, s3);
        System.out.println(result);
    }

    //Method Definition
    public static boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length() + s2.length() != s3.length()) return false;

        boolean[] dp = new boolean[s2.length() + 1];
        dp[0] = true;

        for(int j = 1; j <= s2.length(); j++){
            dp[j] = dp[j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
        }

        for(int i = 1; i <= s1.length(); i++){
            dp[0] = dp[0] && s1.charAt(i - 1) == s3.charAt(i - 1);
            for(int j = 1; j <= s2.length(); j++){
                dp[j] = (dp[j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) ||
                        (dp[j - 1] && s2.charAt(j - 1) == s3.charAt(i + j -1));
            }
        }
        return dp[s2.length()];
    }
}
