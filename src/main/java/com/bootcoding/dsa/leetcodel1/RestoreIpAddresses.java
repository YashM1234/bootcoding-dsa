package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayList;
import java.util.List;

/*
Leetcode Q-93 WAP to Restore Ip Addresses
A valid IP address consists of exactly four integers separated by single dots.
Each integer is between 0 and 255 (inclusive) and cannot have leading zeros.
For example, "0.1.2.201" and "192.168.1.1" are valid IP addresses,
but "0.011.255.245", "192.168.1.312" and "192.168@1.1" are invalid IP addresses.
Given a string s containing only digits, return all possible valid IP addresses
that can be formed by inserting dots into s. You are not allowed to reorder or remove any digits in s.
You may return the valid IP addresses in any order.
 */
public class RestoreIpAddresses {
    public static void main(String[] args) {
        String s = "25525511135";
        //Method Calling
        List<String> result = restoreIpAddresses(s);
        System.out.println(result);
    }

    //Method Definition
    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(String s, int start, List<String> current, List<String> result) {
        if(current.size() == 4){
            if(start == s.length()){
                result.add(String.join(".", current));
            }
            return;
        }

        for(int len = 1; len <= 3; len++){
            if(start + len > s.length()) break;

            String part = s.substring(start, start + len);
            if(isValid(part)){
                current.add(part);
                backtrack(s, start + len, current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    private static boolean isValid(String part){
        if(part.length() > 1 && part.startsWith("0")){
            return false;
        }
        int num = Integer.parseInt(part);
        return num >= 0 && num <= 255;
    }
}
