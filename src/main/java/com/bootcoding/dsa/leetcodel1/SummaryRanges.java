package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayList;
import java.util.List;
/*
Leetcode Q-228 WAP to find Summary Ranges
You are given a sorted unique integer array nums.
A range [a,b] is the set of all integers from a to b (inclusive).
Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b
 */
public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        //Method Calling
        List<String> ranges = summaryRanges(nums);
        System.out.println(ranges);
    }

    //Method Definition
    public static List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        if(nums.length == 0){
            return ranges;
        }

        int left = 0;
        int right = 0;
        while(right + 1 < nums.length){
            if(nums[right] + 1 != nums[right + 1]){
                if(right == left){
                    stringBuilder.append(nums[right]);
                }else{
                    stringBuilder.append(nums[left]).append("->").append(nums[right ]);

                }
                ranges.add(stringBuilder.toString());
                stringBuilder.setLength(0);
                left = right + 1;
            }
            right++;
        }

        if(right == left){
            stringBuilder.append(nums[right]);
        }else{
            stringBuilder.append(nums[left]).append("->").append(nums[right]);
        }
        ranges.add(stringBuilder.toString());
        return ranges;
    }
}
