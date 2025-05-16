package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Leetcode Q-56 WAP to Merge Intervals
Given an array of intervals where intervals[i] = [starti, endi],
merge all overlapping intervals, and return an array of the non-overlapping
intervals that cover all the intervals in the input.
 */
public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };

        //Method Calling
        int[][] result = merge(intervals);
        System.out.println(Arrays.deepToString(result));
    }

    //Method Definition
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merger = new ArrayList<>();
        for(int[] interval: intervals){
            if(merger.isEmpty() || merger.get(merger.size() - 1)[1] < interval[0]){
                merger.add(interval);
            }else{
                merger.get(merger.size() - 1)[1] =Math.max(
                        merger.get(merger.size() - 1)[1], interval[1]
                );
            }
        }

        return merger.toArray(new int[merger.size()][]);
    }
}
