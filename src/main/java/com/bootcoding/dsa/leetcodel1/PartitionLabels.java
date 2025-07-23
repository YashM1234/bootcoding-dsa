package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayList;
import java.util.List;

/*
Leetcode Q-763 WAP for Partition Labels
You are given a string s. We want to partition the string into as many parts as possible so that each letter appears
in at most one part. For example, the string "ababcc" can be partitioned into ["abab", "cc"], but partitions such
as ["aba", "bcc"] or ["ab", "ab", "cc"] are invalid.
Note that the partition is done so that after concatenating all the parts in order, the resultant string should be s.
Return a list of integers representing the size of these parts.
 */
public class PartitionLabels {
    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        //Method Calling
        List<Integer> result = partitionLabels(s);
        System.out.println(result);
    }

    //Method Definition
    public static List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>(0);

        int[] lastIndex = new int[26];
        for(int i = 0; i < s.length(); i++){
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        int start = 0;
        int end = 0;
        for(int i = 0; i < s.length(); i++){
            end = Math.max(end, lastIndex[s.charAt(i) - 'a']);
            if(i == end){
                result.add(end - start + 1);
                start = i + 1;
            }
        }

        return result;
    }
}
