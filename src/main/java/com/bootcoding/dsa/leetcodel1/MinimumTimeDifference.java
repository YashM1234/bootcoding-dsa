package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Leetcode Q-539 WAP to find Minimum Time Difference
Given a list of 24-hour clock time points in "HH:MM" format, return the minimum minutes
difference between any two time-points in the list.
 */
public class MinimumTimeDifference {
    public static void main(String[] args) {
        List<String> timePoints =  List.of("23:59","00:00");
        //Method Calling
        int result = findMinDifference(timePoints);
        System.out.println(result);
    }

    //Method Definition
    public static int findMinDifference(List<String> timePoints){
        List<Integer> mins = new ArrayList<>();
        for(String t: timePoints){
            int h = Integer.parseInt(t.substring(0, 2));
            int m = Integer.parseInt(t.substring(3, 5));
            mins.add(h * 60 + m);
        }

        Collections.sort(mins);

        int ans = 1440;
        for(int i = 1; i < mins.size(); i++){
            ans = Math.min(ans, mins.get(i) - mins.get(i - 1));
            if(ans == 0) return 0;
        }

        int wrap = 1440 + mins.get(0) - mins.get(mins.size() - 1);
        return Math.min(ans, wrap);
    }
}
